package com.example.vivchar.immutableadapter;

import android.support.annotation.NonNull;

import com.example.vivchar.rendererrecyclerviewadapter.ItemModel;

/**
 * Created by Vivchar Vitaly on 1/10/17.
 */
public
class ContentModel implements ItemModel
{

	public static final int TYPE = 1;
	@NonNull
	private final String mName;

	public
	ContentModel(@NonNull final String name) {
		mName = name;
	}

	@Override
	public
	int getType() {
		return TYPE;
	}

	@NonNull
	public
	String getName() {
		return mName;
	}
}