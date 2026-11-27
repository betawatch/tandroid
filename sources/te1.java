// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class te1 extends p66 {
    public final /* synthetic */ byte M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te1(byte b, Context context, Object obj) {
        super(context, null);
        this.M = b;
        this.N = obj;
    }

    @Override // p66
    public final int a() {
        switch (this.M) {
            case 4:
                return ((UndoView) this.N).a;
            default:
                return super.a();
        }
    }

    @Override // p66
    public final int c() {
        switch (this.M) {
            case 3:
                Integer num = ((ilb) this.N).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // p66, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.M;
        Object obj = this.N;
        switch (b) {
            case 2:
                super.onDraw(canvas);
                ((sg2) obj).f();
                break;
            case 3:
                ilb ilbVar = (ilb) obj;
                ilbVar.b();
                super.onDraw(canvas);
                ilbVar.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.widget.TextView, java.lang.Object, p66, te1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.text.SpannableStringBuilder] */
    @Override // p66, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        byte b = this.M;
        Object obj = this.N;
        int i = 0;
        switch (b) {
            case 0:
                if (charSequence != 0) {
                    charSequence = hl.S2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new ho4(aob.p7, ((ue1) obj).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    y7c[] y7cVarArr = (y7c[]) charSequence.getSpans(0, charSequence.length(), y7c.class);
                    while (i < y7cVarArr.length) {
                        charSequence.setSpan(new a31(this, (byte) 1), charSequence.getSpanStart(y7cVarArr[i]), charSequence.getSpanEnd(y7cVarArr[i]), 33);
                        charSequence.removeSpan(y7cVarArr[i]);
                        i++;
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 1:
                gi1 gi1Var = (gi1) obj;
                if (charSequence != 0) {
                    charSequence = hl.S2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new ho4(aob.p7, gi1Var.getResourceProvider()), 0, indexOf2, 33);
                    }
                    y7c[] y7cVarArr2 = (y7c[]) charSequence.getSpans(0, charSequence.length(), y7c.class);
                    EditTextBoldCursor editTextBoldCursor = gi1Var.y;
                    String obj2 = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : gi1Var.y.getText().toString();
                    while (i < y7cVarArr2.length) {
                        charSequence.setSpan(new r1((Object) this, (Object) obj2, (byte) 2), charSequence.getSpanStart(y7cVarArr2[i]), charSequence.getSpanEnd(y7cVarArr2[i]), 33);
                        charSequence.removeSpan(y7cVarArr2[i]);
                        i++;
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 2:
                super.setText(pv3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te1(ilb ilbVar, Context context, m66 m66Var, vnb vnbVar) {
        super(context, m66Var, vnbVar);
        this.M = (byte) 3;
        this.N = ilbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te1(UndoView undoView, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.M = (byte) 4;
        this.N = undoView;
    }
}
