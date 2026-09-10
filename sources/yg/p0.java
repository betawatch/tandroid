package yg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p0 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static p0 b(String str) {
        if (str == null) {
            str = "";
        }
        p0 p0Var = new p0();
        if (!str.startsWith("animated_")) {
            p0Var.f = str;
            p0Var.h = str.hashCode();
            return p0Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            p0Var.g = parseLong;
            p0Var.h = parseLong;
            return p0Var;
        } catch (Exception unused) {
            p0Var.f = str;
            p0Var.h = str.hashCode();
            return p0Var;
        }
    }

    public static p0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        p0 p0Var = new p0();
        p0Var.f = tL_availableReaction.reaction;
        p0Var.h = r3.hashCode();
        return p0Var;
    }

    public static p0 d(TLRPC.Reaction reaction) {
        p0 p0Var = new p0();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            p0Var.a = true;
            return p0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            p0Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            p0Var.h = r3.hashCode();
            return p0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            p0Var.g = j3;
            p0Var.h = j3;
        }
        return p0Var;
    }

    public static p0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        p0 p0Var = new p0();
        p0Var.b = true;
        long j3 = tL_availableEffect.id;
        p0Var.c = j3;
        p0Var.e = tL_availableEffect.effect_animation_id == 0;
        p0Var.g = tL_availableEffect.effect_sticker_id;
        p0Var.h = j3;
        p0Var.d = tL_availableEffect.premium_required;
        p0Var.f = tL_availableEffect.emoticon;
        return p0Var;
    }

    public final p0 a() {
        String findAnimatedEmojiEmoticon;
        long j3 = this.g;
        return (j3 == 0 || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(p5.f(UserConfig.selectedAccount, j3), null)) == null) ? this : b(findAnimatedEmojiEmoticon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (this.g == p0Var.g && Objects.equals(this.f, p0Var.f)) {
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
        if (j3 != 0 && (f7 = p5.f(UserConfig.selectedAccount, j3)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.g);
        sb2.append(", ");
        return a4.a.s(sb2, this.f, "}");
    }
}
