package me.prettyprint.hector.api.beans;

import me.prettyprint.hector.api.Serializer;

/**
 * Hector Column definition.
 *
 * @param <N> The type of the column name
 * @param <V> The type of the column value
 *
 * @author Ran Tavory (rantav@gmail.com)
 *
 */
public interface HColumn<N, V> {

  HColumn<N, V> setName(N name);

  HColumn<N, V> setValue(V value);

  N getName();

  V getValue();

  long getTimestamp();

  Serializer<N> getNameSerializer();

  Serializer<V> getValueSerializer();

}