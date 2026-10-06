package zg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class m0 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static m0 b(String str) {
        if (str == null) {
            str = "";
        }
        m0 m0Var = new m0();
        if (!str.startsWith("animated_")) {
            m0Var.f = str;
            m0Var.h = str.hashCode();
            return m0Var;
        }
        try {
            long parseLong = Long.parseLong(str.substring(9));
            m0Var.g = parseLong;
            m0Var.h = parseLong;
            return m0Var;
        } catch (Exception unused) {
            m0Var.f = str;
            m0Var.h = str.hashCode();
            return m0Var;
        }
    }

    public static m0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        m0 m0Var = new m0();
        m0Var.f = tL_availableReaction.reaction;
        m0Var.h = r3.hashCode();
        return m0Var;
    }

    public static m0 d(TLRPC.Reaction reaction) {
        m0 m0Var = new m0();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            m0Var.a = true;
            return m0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            m0Var.f = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            m0Var.h = r3.hashCode();
            return m0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            m0Var.g = j3;
            m0Var.h = j3;
        }
        return m0Var;
    }

    public static m0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        m0 m0Var = new m0();
        m0Var.b = true;
        long j3 = tL_availableEffect.id;
        m0Var.c = j3;
        m0Var.e = tL_availableEffect.effect_animation_id == 0;
        m0Var.g = tL_availableEffect.effect_sticker_id;
        m0Var.h = j3;
        m0Var.d = tL_availableEffect.premium_required;
        m0Var.f = tL_availableEffect.emoticon;
        return m0Var;
    }

    public final m0 a() {
        String findAnimatedEmojiEmoticon;
        long j3 = this.g;
        return (j3 == 0 || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(q5.f(UserConfig.selectedAccount, j3), null)) == null) ? this : b(findAnimatedEmojiEmoticon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m0.class == obj.getClass()) {
            m0 m0Var = (m0) obj;
            if (this.g == m0Var.g && Objects.equals(this.f, m0Var.f)) {
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
