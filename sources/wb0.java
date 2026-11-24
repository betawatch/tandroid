// default package

import android.graphics.drawable.BitmapDrawable;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wb0 {
    public final gl5 a;
    public final gl5 b;
    public final gl5 c;
    public final String d;
    public final String e;
    public final String f;
    public final BitmapDrawable g;
    public final Object h;
    public final cc0[] i;
    public final yb0 j;

    public wb0(gl5 gl5Var, gl5 gl5Var2, gl5 gl5Var3, String str, String str2, String str3, BitmapDrawable bitmapDrawable, Object obj, cc0[] cc0VarArr, yb0 yb0Var) {
        this.a = gl5Var;
        this.b = gl5Var2;
        this.c = gl5Var3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bitmapDrawable;
        this.h = obj;
        this.i = cc0VarArr;
        this.j = yb0Var;
    }

    public static wb0 a(TLRPC.Chat chat, TLRPC.ChatFull chatFull, cc0... cc0VarArr) {
        gl5 gl5Var;
        String str;
        TLRPC.ChatPhoto chatPhoto;
        gl5 m = gl5.m(y6c.t0, 0, chat);
        gl5 m2 = gl5.m(y6c.t0, 1, chat);
        String str2 = null;
        String str3 = (m2 == null || !(m2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (chat == null || (chatPhoto = chat.photo) == null) ? null : chatPhoto.strippedBitmap;
        TLRPC.Photo photo = chatFull.chat_photo;
        if (photo == null || photo.video_sizes.isEmpty()) {
            gl5Var = null;
            str = null;
        } else {
            TLRPC.VideoSize x = ba4.x(1000, chatFull.chat_photo.video_sizes);
            gl5Var = gl5.j(x, chatFull.chat_photo);
            str = ba4.r(null, x);
        }
        if (gl5Var != null && gl5Var.p == 2) {
            str2 = "g";
        }
        return new wb0(m, m2, gl5Var, str3, str2, str, bitmapDrawable, chat, cc0VarArr, null);
    }

    public static wb0 b(TLRPC.User user, int i, cc0... cc0VarArr) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        gl5 m = gl5.m(y6c.t0, 0, user);
        gl5 m2 = gl5.m(y6c.t0, 1, user);
        BitmapDrawable bitmapDrawable = null;
        String str = (m2 == null || !(m2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        if (user != null && (userProfilePhoto = user.photo) != null) {
            bitmapDrawable = userProfilePhoto.strippedBitmap;
        }
        return new wb0(m, m2, null, str, null, null, bitmapDrawable, user, cc0VarArr, new dc0(i, kk7.D0, user));
    }

    public static wb0 c(TLRPC.User user, TLRPC.UserFull userFull, cc0... cc0VarArr) {
        gl5 gl5Var;
        String str;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        gl5 m = gl5.m(y6c.t0, 0, userFull.user);
        String str2 = null;
        if (m == null && (photo = userFull.profile_photo) != null) {
            m = gl5.i(ba4.w(photo.sizes, 500, false, null, false), userFull.profile_photo);
        }
        gl5 gl5Var2 = m;
        gl5 m2 = gl5.m(y6c.t0, 1, userFull.user);
        String str3 = (m2 == null || !(m2.k instanceof TLRPC.TL_photoStrippedSize)) ? null : "b";
        BitmapDrawable bitmapDrawable = (user == null || (userProfilePhoto = user.photo) == null) ? null : userProfilePhoto.strippedBitmap;
        TLRPC.Photo photo2 = userFull.profile_photo;
        if (photo2 == null || photo2.video_sizes.isEmpty()) {
            gl5Var = null;
            str = null;
        } else {
            TLRPC.VideoSize x = ba4.x(1000, userFull.profile_photo.video_sizes);
            gl5 j = gl5.j(x, userFull.profile_photo);
            str = ba4.r(null, x);
            gl5Var = j;
        }
        if (gl5Var != null && gl5Var.p == 2) {
            str2 = "g";
        }
        return new wb0(gl5Var2, m2, gl5Var, str3, str2, str, bitmapDrawable, userFull.user, cc0VarArr, null);
    }
}
