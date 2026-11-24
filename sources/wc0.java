// default package

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wc0 {
    public final gn5 a;
    public final gn5 b;
    public final gn5 c;
    public final String d;
    public final String e;
    public final String f;
    public final BitmapDrawable g;
    public final Object h;
    public final cd0[] i;
    public final yc0 j;

    public wc0(gn5 gn5Var, gn5 gn5Var2, gn5 gn5Var3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, cd0[] cd0VarArr, yc0 yc0Var) {
        this.a = gn5Var;
        this.b = gn5Var2;
        this.c = gn5Var3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bitmapDrawable;
        this.h = obj;
        this.i = cd0VarArr;
        this.j = yc0Var;
    }

    public static wc0 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, cd0... cd0VarArr) {
        gn5 gn5Var;
        String str;
        TLRPC.ChatPhoto chatPhoto;
        gn5 m = gn5.m(z8c.t0, 0, chat);
        gn5 m2 = gn5.m(z8c.t0, 1, chat);
        String str2 = null;
        String str3 = (m2 == null || !(m2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (chat == null || (chatPhoto = chat.photo) == null) ? null : chatPhoto.strippedBitmap;
        TLRPC.Photo photo = chatFull.chat_photo;
        if (photo == null || photo.video_sizes.isEmpty()) {
            gn5Var = null;
            str = null;
        } else {
            TLRPC.VideoSize x = bc4.x(1000, chatFull.chat_photo.video_sizes);
            gn5Var = gn5.j(x, chatFull.chat_photo);
            str = bc4.r(null, x);
        }
        if (gn5Var != null && gn5Var.p == 2) {
            str2 = "g";
        }
        return new wc0(m, m2, gn5Var, str3, str2, str, bitmapDrawable, chat, cd0VarArr, null);
    }

    public static wc0 b(TLRPC.User user, int i, cd0... cd0VarArr) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        gn5 m = gn5.m(z8c.t0, 0, user);
        gn5 m2 = gn5.m(z8c.t0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        String str = (m2 == null || !(m2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new wc0(m, m2, null, str, null, null, bitmapDrawable, user, cd0VarArr, new dd0(i, nm7.E0, user));
    }

    public static wc0 c(TLRPC.User user, TLRPC.UserFull userFull, cd0... cd0VarArr) {
        gn5 gn5Var;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        gn5 m = gn5.m(z8c.t0, 0, userFull.user);
        String str2 = null;
        if (m == null && (photo = userFull.profile_photo) != null) {
            m = gn5.i(bc4.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        gn5 gn5Var2 = m;
        gn5 m2 = gn5.m(z8c.t0, 1, userFull.user);
        String str3 = (m2 == null || !(m2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.strippedBitmap;
        TLRPC.Photo photo2 = userFull.profile_photo;
        if (photo2 == null || photo2.video_sizes.isEmpty()) {
            gn5Var = null;
            str = null;
        } else {
            TLRPC.VideoSize x = bc4.x(1000, userFull.profile_photo.video_sizes);
            gn5 j = gn5.j(x, userFull.profile_photo);
            str = bc4.r(null, x);
            gn5Var = j;
        }
        if (gn5Var != null && gn5Var.p == 2) {
            str2 = "g";
        }
        return new wc0(gn5Var2, m2, gn5Var, str3, str2, str, bitmapDrawable, userFull.user, cd0VarArr, null);
    }
}
