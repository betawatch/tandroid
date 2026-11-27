// default package

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class w49 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static w49 b(String str) {
        if (str == null) {
            str = "";
        }
        w49 w49Var = new w49();
        if (!str.startsWith("animated_")) {
            w49Var.f = str;
            w49Var.h = str.hashCode();
            return w49Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            w49Var.g = parseLong;
            w49Var.h = parseLong;
            return w49Var;
        } catch (Exception unused) {
            w49Var.f = str;
            w49Var.h = str.hashCode();
            return w49Var;
        }
    }

    public static w49 c(TLRPC.TL_availableReaction tL_availableReaction) {
        w49 w49Var = new w49();
        w49Var.f = tL_availableReaction.reaction;
        w49Var.h = r3.hashCode();
        return w49Var;
    }

    public static w49 d(TLRPC.Reaction reaction) {
        w49 w49Var = new w49();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            w49Var.a = true;
            return w49Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            w49Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            w49Var.h = r3.hashCode();
            return w49Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            w49Var.g = j;
            w49Var.h = j;
        }
        return w49Var;
    }

    public static w49 e(TLRPC.TL_availableEffect tL_availableEffect) {
        w49 w49Var = new w49();
        w49Var.b = true;
        long j = tL_availableEffect.id;
        w49Var.c = j;
        w49Var.e = tL_availableEffect.effect_animation_id == 0;
        w49Var.g = tL_availableEffect.effect_sticker_id;
        w49Var.h = j;
        w49Var.d = tL_availableEffect.premium_required;
        w49Var.f = tL_availableEffect.emoticon;
        return w49Var;
    }

    public final w49 a() {
        String V;
        long j = this.g;
        return (j == 0 || (V = r47.V(wl.e(yac.t0, j), null, null)) == null) ? this : b(V);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w49.class == obj.getClass()) {
            w49 w49Var = (w49) obj;
            if (this.g == w49Var.g && Objects.equals(this.f, w49Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        return reaction instanceof TLRPC.TL_reactionEmoji ? TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f) : (reaction instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == this.g;
    }

    public final TLRPC.Reaction g() {
        if (this.a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f, Long.valueOf(this.g));
    }

    public final String toString() {
        TLRPC.Document e;
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        long j = this.g;
        if (j != 0 && (e = wl.e(yac.t0, j)) != null) {
            return r47.V(e, null, null);
        }
        StringBuilder sb = new StringBuilder("VisibleReaction{");
        sb.append(this.g);
        sb.append(", ");
        return c00.k(sb, this.f, "}");
    }
}
