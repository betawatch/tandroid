// default package

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vib {
    public int a;
    public int b;
    public int c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public vib(vib vibVar) {
        this.a = vibVar.a;
        this.b = vibVar.b;
        this.c = vibVar.c;
        this.d = vibVar.d;
        this.e = vibVar.e;
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        boolean z = this.e;
        int i = this.a;
        if (z) {
            typeface = (i & 2) != 0 ? gl.n1("fonts/mw_bolditalic.ttf") : gl.n1("fonts/mw_bold.ttf");
        } else if ((i & 4) == 0 && (i & 2048) == 0) {
            int i2 = i & 1;
            int i3 = i & 2;
            typeface = i2 != 0 ? i3 != 0 ? gl.n1("fonts/rmediumitalic.ttf") : gl.o() : i3 != 0 ? gl.n1("fonts/ritalic.ttf") : null;
        } else {
            typeface = Typeface.MONOSPACE;
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        if ((this.a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i4 = this.a;
        if ((i4 & 8) == 0 && (i4 & TLObject.FLAG_13) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.a & 512) != 0) {
            textPaint.bgColor = bkb.w0(null, bkb.Q9, false);
        }
        int i5 = this.a;
        if ((i5 & TLObject.FLAG_13) != 0) {
            textPaint.setColor(bkb.w0(null, bkb.p7, false));
        } else if ((i5 & TLObject.FLAG_12) != 0) {
            textPaint.setColor(bkb.w0(null, bkb.Ei, false));
        }
    }

    public final void b(vib vibVar) {
        TLRPC.MessageEntity messageEntity;
        this.a |= vibVar.a;
        if (this.d != null || (messageEntity = vibVar.d) == null) {
            return;
        }
        this.d = messageEntity;
    }
}
