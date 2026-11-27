// default package

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rmb {
    public int a;
    public int b;
    public int c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public rmb(rmb rmbVar) {
        this.a = rmbVar.a;
        this.b = rmbVar.b;
        this.c = rmbVar.c;
        this.d = rmbVar.d;
        this.e = rmbVar.e;
    }

    public final void a(TextPaint textPaint) {
        Typeface b = b();
        if (b != null) {
            textPaint.setTypeface(b);
        }
        if ((this.a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i = this.a;
        if ((i & 8) == 0 && (i & TLObject.FLAG_13) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.a & 512) != 0) {
            textPaint.bgColor = aob.w0(null, aob.R9, false);
        }
        int i2 = this.a;
        if ((i2 & TLObject.FLAG_13) != 0) {
            textPaint.setColor(aob.w0(null, aob.q7, false));
        } else if ((i2 & TLObject.FLAG_12) != 0) {
            textPaint.setColor(aob.w0(null, aob.Fi, false));
        }
    }

    public final Typeface b() {
        boolean z = this.e;
        int i = this.a;
        if (z) {
            return (i & 2) != 0 ? hl.n1("fonts/mw_bolditalic.ttf") : hl.n1("fonts/mw_bold.ttf");
        }
        if ((i & 4) != 0 || (i & 2048) != 0) {
            return Typeface.MONOSPACE;
        }
        int i2 = i & 1;
        int i3 = i & 2;
        if (i2 != 0) {
            return i3 != 0 ? hl.n1("fonts/rmediumitalic.ttf") : hl.o();
        }
        if (i3 != 0) {
            return hl.n1("fonts/ritalic.ttf");
        }
        return null;
    }

    public final void c(rmb rmbVar) {
        TLRPC.MessageEntity messageEntity;
        this.a |= rmbVar.a;
        if (this.d != null || (messageEntity = rmbVar.d) == null) {
            return;
        }
        this.d = messageEntity;
    }
}
