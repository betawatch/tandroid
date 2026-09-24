package zg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q5;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class o0 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static o0 b(String str) {
        if (str == null) {
            str = "";
        }
        o0 o0Var = new o0();
        if (!str.startsWith("animated_")) {
            o0Var.f = str;
            o0Var.h = str.hashCode();
            return o0Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            o0Var.g = parseLong;
            o0Var.h = parseLong;
            return o0Var;
        } catch (Exception unused) {
            o0Var.f = str;
            o0Var.h = str.hashCode();
            return o0Var;
        }
    }

    public static o0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        o0 o0Var = new o0();
        o0Var.f = tL_availableReaction.reaction;
        o0Var.h = r3.hashCode();
        return o0Var;
    }

    public static o0 d(TLRPC.Reaction reaction) {
        o0 o0Var = new o0();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            o0Var.a = true;
            return o0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            o0Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            o0Var.h = r3.hashCode();
            return o0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            o0Var.g = j3;
            o0Var.h = j3;
        }
        return o0Var;
    }

    public static o0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        o0 o0Var = new o0();
        o0Var.b = true;
        long j3 = tL_availableEffect.id;
        o0Var.c = j3;
        o0Var.e = tL_availableEffect.effect_animation_id == 0;
        o0Var.g = tL_availableEffect.effect_sticker_id;
        o0Var.h = j3;
        o0Var.d = tL_availableEffect.premium_required;
        o0Var.f = tL_availableEffect.emoticon;
        return o0Var;
    }

    public final o0 a() {
        String findAnimatedEmojiEmoticon;
        long j3 = this.g;
        return (j3 == 0 || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(q5.f(UserConfig.selectedAccount, j3), null)) == null) ? this : b(findAnimatedEmojiEmoticon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            o0 o0Var = (o0) obj;
            if (this.g == o0Var.g && Objects.equals(this.f, o0Var.f)) {
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
        TLRPC.Document f7;
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        long j3 = this.g;
        if (j3 != 0 && (f7 = q5.f(UserConfig.selectedAccount, j3)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.g);
        sb2.append(", ");
        return a4.a.t(sb2, this.f, "}");
    }
}
