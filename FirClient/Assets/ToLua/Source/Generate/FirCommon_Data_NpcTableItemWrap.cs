﻿//this source code was auto-generated by tolua#, do not modify it
using System;
using LuaInterface;

public class FirCommon_Data_NpcTableItemWrap
{
	public static void Register(LuaState L)
	{
		L.BeginClass(typeof(FirCommon.Data.NpcTableItem), typeof(System.Object));
		L.RegFunction("New", new LuaCSFunction(_CreateFirCommon_Data_NpcTableItem));
		L.RegFunction("__tostring", new LuaCSFunction(ToLua.op_ToString));
		L.RegVar("id", new LuaCSFunction(get_id), new LuaCSFunction(set_id));
		L.RegVar("name", new LuaCSFunction(get_name), new LuaCSFunction(set_name));
		L.RegVar("isMainCharacter", new LuaCSFunction(get_isMainCharacter), new LuaCSFunction(set_isMainCharacter));
		L.RegVar("sex", new LuaCSFunction(get_sex), new LuaCSFunction(set_sex));
		L.RegVar("country", new LuaCSFunction(get_country), new LuaCSFunction(set_country));
		L.RegVar("scale", new LuaCSFunction(get_scale), new LuaCSFunction(set_scale));
		L.RegVar("itemid", new LuaCSFunction(get_itemid), new LuaCSFunction(set_itemid));
		L.EndClass();
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int _CreateFirCommon_Data_NpcTableItem(IntPtr L)
	{
		try
		{
			int count = LuaDLL.lua_gettop(L);

			if (count == 0)
			{
				FirCommon.Data.NpcTableItem obj = new FirCommon.Data.NpcTableItem();
				ToLua.PushObject(L, obj);
				return 1;
			}
			else
			{
				return LuaDLL.luaL_throw(L, "invalid arguments to ctor method: FirCommon.Data.NpcTableItem.New");
			}
		}
		catch (Exception e)
		{
			return LuaDLL.toluaL_exception(L, e);
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_id(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			int ret = obj.id;
			LuaDLL.lua_pushinteger(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index id on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_name(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			string ret = obj.name;
			LuaDLL.lua_pushstring(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index name on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_isMainCharacter(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			bool ret = obj.isMainCharacter;
			LuaDLL.lua_pushboolean(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index isMainCharacter on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_sex(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			int ret = obj.sex;
			LuaDLL.lua_pushinteger(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index sex on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_country(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			CountryType ret = obj.country;
			ToLua.Push(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index country on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_scale(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			FirCommon.Data.FVector3 ret = obj.scale;
			ToLua.PushObject(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index scale on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int get_itemid(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			int ret = obj.itemid;
			LuaDLL.lua_pushinteger(L, ret);
			return 1;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index itemid on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_id(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			int arg0 = (int)LuaDLL.luaL_checkinteger(L, 2);
			obj.id = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index id on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_name(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			string arg0 = ToLua.CheckString(L, 2);
			obj.name = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index name on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_isMainCharacter(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			bool arg0 = LuaDLL.luaL_checkboolean(L, 2);
			obj.isMainCharacter = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index isMainCharacter on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_sex(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			int arg0 = (int)LuaDLL.luaL_checkinteger(L, 2);
			obj.sex = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index sex on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_country(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			CountryType arg0 = (CountryType)ToLua.CheckObject(L, 2, TypeTraits<CountryType>.type);
			obj.country = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index country on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_scale(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			FirCommon.Data.FVector3 arg0 = (FirCommon.Data.FVector3)ToLua.CheckObject<FirCommon.Data.FVector3>(L, 2);
			obj.scale = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index scale on a nil value");
		}
	}

	[MonoPInvokeCallbackAttribute(typeof(LuaCSFunction))]
	static int set_itemid(IntPtr L)
	{
		object o = null;

		try
		{
			o = ToLua.ToObject(L, 1);
			FirCommon.Data.NpcTableItem obj = (FirCommon.Data.NpcTableItem)o;
			int arg0 = (int)LuaDLL.luaL_checkinteger(L, 2);
			obj.itemid = arg0;
			return 0;
		}
		catch(Exception e)
		{
			return LuaDLL.toluaL_exception(L, e, o, "attempt to index itemid on a nil value");
		}
	}
}

