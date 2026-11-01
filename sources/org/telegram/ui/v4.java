package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v4 {
    public final org.telegram.messenger.jc a;
    public final org.telegram.messenger.jc b;
    public final org.telegram.messenger.jc c;
    public final String d;
    public final String e;
    public final String f;
    public final BitmapDrawable g;
    public final Object h;
    public final b5[] i;
    public final x4 j;

    public v4(org.telegram.messenger.jc jcVar, org.telegram.messenger.jc jcVar2, org.telegram.messenger.jc jcVar3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, b5[] b5VarArr, x4 x4Var) {
        this.a = jcVar;
        this.b = jcVar2;
        this.c = jcVar3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bitmapDrawable;
        this.h = obj;
        this.i = b5VarArr;
        this.j = x4Var;
    }

    public static v4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, b5... b5VarArr) {
        org.telegram.messenger.jc jcVar;
        String str;
        TLRPC.ChatPhoto chatPhoto;
        org.telegram.messenger.jc m10 = org.telegram.messenger.jc.m(org.telegram.messenger.e20.s0, 0, chat);
        org.telegram.messenger.jc m11 = org.telegram.messenger.jc.m(org.telegram.messenger.e20.s0, 1, chat);
        String str2 = null;
        String str3 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (chat == null || (chatPhoto = chat.photo) == null) ? null : chatPhoto.strippedBitmap;
        TLRPC.Photo photo = chatFull.chat_photo;
        if (photo == null || photo.video_sizes.isEmpty()) {
            jcVar = null;
            str = null;
        } else {
            TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, chatFull.chat_photo.video_sizes);
            jcVar = org.telegram.messenger.jc.j(x10, chatFull.chat_photo);
            str = org.telegram.messenger.b8.r(null, x10);
        }
        if (jcVar != null && jcVar.p == 2) {
            str2 = "g";
        }
        return new v4(m10, m11, jcVar, str3, str2, str, bitmapDrawable, chat, b5VarArr, null);
    }

    public static v4 b(TLRPC.User user, int i10, b5... b5VarArr) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.messenger.jc m10 = org.telegram.messenger.jc.m(org.telegram.messenger.e20.s0, 0, user);
        org.telegram.messenger.jc m11 = org.telegram.messenger.jc.m(org.telegram.messenger.e20.s0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        String str = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new v4(m10, m11, null, str, null, null, bitmapDrawable, user, b5VarArr, new c5(i10, org.telegram.messenger.at.E0, user));
    }

    public static v4 c(TLRPC.User user, TLRPC.UserFull userFull, b5... b5VarArr) {
        org.telegram.messenger.jc jcVar;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        org.telegram.messenger.jc m10 = org.telegram.messenger.jc.m(org.telegram.messenger.e20.s0, 0, userFull.user);
        String str2 = null;
        if (m10 == null && (photo = userFull.profile_photo) != null) {
            m10 = org.telegram.messenger.jc.i(org.telegram.messenger.b8.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        org.telegram.messenger.jc jcVar2 = m10;
        org.telegram.messenger.jc m11 = org.telegram.messenger.jc.m(org.telegram.messenger.e20.s0, 1, userFull.user);
        String str3 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.strippedBitmap;
        TLRPC.Photo photo2 = userFull.profile_photo;
        if (photo2 == null || photo2.video_sizes.isEmpty()) {
            jcVar = null;
            str = null;
        } else {
            TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, userFull.profile_photo.video_sizes);
            org.telegram.messenger.jc j10 = org.telegram.messenger.jc.j(x10, userFull.profile_photo);
            str = org.telegram.messenger.b8.r(null, x10);
            jcVar = j10;
        }
        if (jcVar != null && jcVar.p == 2) {
            str2 = "g";
        }
        return new v4(jcVar2, m11, jcVar, str3, str2, str, bitmapDrawable, userFull.user, b5VarArr, null);
    }
}
