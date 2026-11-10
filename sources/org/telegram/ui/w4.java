package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w4 {
    public final org.telegram.messenger.hc a;
    public final org.telegram.messenger.hc b;
    public final org.telegram.messenger.hc c;
    public final String d;
    public final String e;
    public final String f;
    public final BitmapDrawable g;
    public final Object h;
    public final c5[] i;
    public final y4 j;

    public w4(org.telegram.messenger.hc hcVar, org.telegram.messenger.hc hcVar2, org.telegram.messenger.hc hcVar3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, c5[] c5VarArr, y4 y4Var) {
        this.a = hcVar;
        this.b = hcVar2;
        this.c = hcVar3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bitmapDrawable;
        this.h = obj;
        this.i = c5VarArr;
        this.j = y4Var;
    }

    public static w4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, c5... c5VarArr) {
        org.telegram.messenger.hc hcVar;
        String str;
        TLRPC.ChatPhoto chatPhoto;
        org.telegram.messenger.hc m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 0, chat);
        org.telegram.messenger.hc m11 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 1, chat);
        String str2 = null;
        String str3 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (chat == null || (chatPhoto = chat.photo) == null) ? null : chatPhoto.strippedBitmap;
        TLRPC.Photo photo = chatFull.chat_photo;
        if (photo == null || photo.video_sizes.isEmpty()) {
            hcVar = null;
            str = null;
        } else {
            TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, chatFull.chat_photo.video_sizes);
            hcVar = org.telegram.messenger.hc.j(x10, chatFull.chat_photo);
            str = org.telegram.messenger.w7.r(null, x10);
        }
        if (hcVar != null && hcVar.p == 2) {
            str2 = "g";
        }
        return new w4(m10, m11, hcVar, str3, str2, str, bitmapDrawable, chat, c5VarArr, null);
    }

    public static w4 b(TLRPC.User user, int i7, c5... c5VarArr) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.messenger.hc m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 0, user);
        org.telegram.messenger.hc m11 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        String str = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new w4(m10, m11, null, str, null, null, bitmapDrawable, user, c5VarArr, new d5(i7, org.telegram.messenger.qs.E0, user));
    }

    public static w4 c(TLRPC.User user, TLRPC.UserFull userFull, c5... c5VarArr) {
        org.telegram.messenger.hc hcVar;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        org.telegram.messenger.hc m10 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 0, userFull.user);
        String str2 = null;
        if (m10 == null && (photo = userFull.profile_photo) != null) {
            m10 = org.telegram.messenger.hc.i(org.telegram.messenger.w7.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        org.telegram.messenger.hc hcVar2 = m10;
        org.telegram.messenger.hc m11 = org.telegram.messenger.hc.m(org.telegram.messenger.p10.s0, 1, userFull.user);
        String str3 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.strippedBitmap;
        TLRPC.Photo photo2 = userFull.profile_photo;
        if (photo2 == null || photo2.video_sizes.isEmpty()) {
            hcVar = null;
            str = null;
        } else {
            TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, userFull.profile_photo.video_sizes);
            org.telegram.messenger.hc j3 = org.telegram.messenger.hc.j(x10, userFull.profile_photo);
            str = org.telegram.messenger.w7.r(null, x10);
            hcVar = j3;
        }
        if (hcVar != null && hcVar.p == 2) {
            str2 = "g";
        }
        return new w4(hcVar2, m11, hcVar, str3, str2, str, bitmapDrawable, userFull.user, c5VarArr, null);
    }
}
