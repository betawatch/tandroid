// default package

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w74 {
    public boolean a;
    public StaticLayout b;
    public StaticLayout c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(rc2 rc2Var) {
        TLRPC.Message message;
        String str;
        SpannableStringBuilder e = y4b.e(new Object[0], 2131750811, false);
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject != null && (message = messageObject.k) != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
                TLRPC.User W1 = oc7.r1(rc2Var.a6).W1(Long.valueOf(((TLRPC.TL_messageMediaStory) messageMedia).user_id));
                String str2 = W1 == null ? "DELETED" : W1.first_name;
                int P0 = (int) ((gm.O1() ? gm.P0() : rc2Var.getParentWidth()) * 0.4f);
                int ceil = (int) Math.ceil(cmb.W2.measureText(jb6.M0(2131750441, null).concat(" ")));
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = (String) TextUtils.ellipsize(str2.replace('\n', ' '), cmb.X2, P0 - ceil, TextUtils.TruncateAt.END);
                String M0 = jb6.M0(2131750437, null);
                int indexOf = M0.indexOf("%1$s");
                String format = String.format(M0, str3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
                    spannableStringBuilder.setSpan(new z5c(gm.o()), indexOf, str3.length() + indexOf, 33);
                    str = spannableStringBuilder;
                } else {
                    str = format;
                }
                TextPaint textPaint = cmb.Y2;
                int L = gm.L(10.0f) + ((int) (textPaint.measureText(e, 0, e.length()) + 1.0f));
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.b = new StaticLayout(e, textPaint, L, alignment, 1.0f, 0.0f, false);
                this.c = new StaticLayout(str, textPaint, gm.L(10.0f) + ((int) (textPaint.measureText((CharSequence) str, 0, str.length()) + 1.0f)), alignment, 1.0f, 0.0f, false);
                this.e = 0;
                this.h = gm.L(4.0f);
                this.i = gm.L(12.0f);
                this.e = (int) ts2.i(this.h, 2.0f, gm.L(4.0f) + this.c.getHeight() + gm.L(2.0f) + this.b.getHeight() + gm.L(4.0f), this.e);
                this.d = rc2Var.getExtraTextX() + gm.L(20.0f) + gm.L(12.0f) + Math.max(this.b.getWidth(), this.c.getWidth());
                return;
            }
        }
        this.h = gm.L(4.0f);
        this.i = gm.L(12.0f);
        this.e = 0;
        this.d = 0;
    }
}
