package zg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class n0 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static n0 b(String str) {
        if (str == null) {
            str = "";
        }
        n0 n0Var = new n0();
        if (!str.startsWith("animated_")) {
            n0Var.f = str;
            n0Var.h = str.hashCode();
            return n0Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            n0Var.g = parseLong;
            n0Var.h = parseLong;
            return n0Var;
        } catch (Exception unused) {
            n0Var.f = str;
            n0Var.h = str.hashCode();
            return n0Var;
        }
    }

    public static n0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        n0 n0Var = new n0();
        n0Var.f = tL_availableReaction.reaction;
        n0Var.h = r3.hashCode();
        return n0Var;
    }

    public static n0 d(TLRPC.Reaction reaction) {
        n0 n0Var = new n0();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            n0Var.a = true;
            return n0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            n0Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            n0Var.h = r3.hashCode();
            return n0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            n0Var.g = j3;
            n0Var.h = j3;
        }
        return n0Var;
    }

    public static n0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        n0 n0Var = new n0();
        n0Var.b = true;
        long j3 = tL_availableEffect.id;
        n0Var.c = j3;
        n0Var.e = tL_availableEffect.effect_animation_id == 0;
        n0Var.g = tL_availableEffect.effect_sticker_id;
        n0Var.h = j3;
        n0Var.d = tL_availableEffect.premium_required;
        n0Var.f = tL_availableEffect.emoticon;
        return n0Var;
    }

    public final n0 a() {
        String findAnimatedEmojiEmoticon;
        long j3 = this.g;
        return (j3 == 0 || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(s5.f(UserConfig.selectedAccount, j3), null)) == null) ? this : b(findAnimatedEmojiEmoticon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (this.g == n0Var.g && Objects.equals(this.f, n0Var.f)) {
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
        if (j3 != 0 && (f7 = s5.f(UserConfig.selectedAccount, j3)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.g);
        sb2.append(", ");
        return a1.g.t(sb2, this.f, "}");
    }
}
