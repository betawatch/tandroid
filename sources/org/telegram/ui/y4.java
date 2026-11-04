package org.telegram.ui;

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y4 {
    public final org.telegram.messenger.ac a;
    public final org.telegram.messenger.ac b;
    public final org.telegram.messenger.ac c;
    public final String d;
    public final String e;
    public final String f;
    public final BitmapDrawable g;
    public final Object h;
    public final e5[] i;
    public final a5 j;

    public y4(org.telegram.messenger.ac acVar, org.telegram.messenger.ac acVar2, org.telegram.messenger.ac acVar3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, e5[] e5VarArr, a5 a5Var) {
        this.a = acVar;
        this.b = acVar2;
        this.c = acVar3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bitmapDrawable;
        this.h = obj;
        this.i = e5VarArr;
        this.j = a5Var;
    }

    public static y4 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, e5... e5VarArr) {
        org.telegram.messenger.ac acVar;
        String str;
        TLRPC.ChatPhoto chatPhoto;
        org.telegram.messenger.ac m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 0, chat);
        org.telegram.messenger.ac m11 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 1, chat);
        String str2 = null;
        String str3 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (chat == null || (chatPhoto = chat.photo) == null) ? null : chatPhoto.strippedBitmap;
        TLRPC.Photo photo = chatFull.chat_photo;
        if (photo == null || photo.video_sizes.isEmpty()) {
            acVar = null;
            str = null;
        } else {
            TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, chatFull.chat_photo.video_sizes);
            acVar = org.telegram.messenger.ac.j(x10, chatFull.chat_photo);
            str = org.telegram.messenger.w7.r(null, x10);
        }
        if (acVar != null && acVar.p == 2) {
            str2 = "g";
        }
        return new y4(m10, m11, acVar, str3, str2, str, bitmapDrawable, chat, e5VarArr, null);
    }

    public static y4 b(TLRPC.User user, int i3, e5... e5VarArr) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        org.telegram.messenger.ac m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 0, user);
        org.telegram.messenger.ac m11 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        String str = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new y4(m10, m11, null, str, null, null, bitmapDrawable, user, e5VarArr, new f5(i3, org.telegram.messenger.hs.E0, user));
    }

    public static y4 c(TLRPC.User user, TLRPC.UserFull userFull, e5... e5VarArr) {
        org.telegram.messenger.ac acVar;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        org.telegram.messenger.ac m10 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 0, userFull.user);
        String str2 = null;
        if (m10 == null && (photo = userFull.profile_photo) != null) {
            m10 = org.telegram.messenger.ac.i(org.telegram.messenger.w7.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        org.telegram.messenger.ac acVar2 = m10;
        org.telegram.messenger.ac m11 = org.telegram.messenger.ac.m(org.telegram.messenger.h10.t0, 1, userFull.user);
        String str3 = (m11 == null || !(m11.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.strippedBitmap;
        TLRPC.Photo photo2 = userFull.profile_photo;
        if (photo2 == null || photo2.video_sizes.isEmpty()) {
            acVar = null;
            str = null;
        } else {
            TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, userFull.profile_photo.video_sizes);
            org.telegram.messenger.ac j10 = org.telegram.messenger.ac.j(x10, userFull.profile_photo);
            str = org.telegram.messenger.w7.r(null, x10);
            acVar = j10;
        }
        if (acVar != null && acVar.p == 2) {
            str2 = "g";
        }
        return new y4(acVar2, m11, acVar, str3, str2, str, bitmapDrawable, userFull.user, e5VarArr, null);
    }
}
