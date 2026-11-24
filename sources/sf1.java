// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sf1 extends l66 {
    public final /* synthetic */ byte M;
    public final /* synthetic */ Object N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sf1(byte b, Context context, Object obj) {
        super(context, null);
        this.M = b;
        this.N = obj;
    }

    @Override // l66
    public final int a() {
        switch (this.M) {
            case 4:
                return ((UndoView) this.N).a;
            default:
                return super.a();
        }
    }

    @Override // l66
    public final int c() {
        switch (this.M) {
            case 3:
                Integer num = ((njb) this.N).d;
                if (num == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.c();
    }

    @Override // l66, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        byte b = this.M;
        Object obj = this.N;
        switch (b) {
            case 2:
                super.onDraw(canvas);
                ((oh2) obj).f();
                break;
            case 3:
                njb njbVar = (njb) obj;
                njbVar.b();
                super.onDraw(canvas);
                njbVar.a();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.widget.TextView, java.lang.Object, l66, sf1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.text.SpannableStringBuilder] */
    @Override // l66, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        byte b = this.M;
        Object obj = this.N;
        int i = 0;
        switch (b) {
            case 0:
                if (charSequence != 0) {
                    charSequence = gm.S2(charSequence.toString());
                    int indexOf = charSequence.toString().indexOf(10);
                    if (indexOf >= 0) {
                        charSequence.replace(indexOf, indexOf + 1, " ");
                        charSequence.setSpan(new do4(cmb.o7, ((tf1) obj).e.getResourceProvider()), 0, indexOf, 33);
                    }
                    z5c[] z5cVarArr = (z5c[]) charSequence.getSpans(0, charSequence.length(), z5c.class);
                    while (i < z5cVarArr.length) {
                        charSequence.setSpan(new z31(this, (byte) 1), charSequence.getSpanStart(z5cVarArr[i]), charSequence.getSpanEnd(z5cVarArr[i]), 33);
                        charSequence.removeSpan(z5cVarArr[i]);
                        i++;
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 1:
                fj1 fj1Var = (fj1) obj;
                if (charSequence != 0) {
                    charSequence = gm.S2(charSequence.toString());
                    int indexOf2 = charSequence.toString().indexOf(10);
                    if (indexOf2 >= 0) {
                        charSequence.replace(indexOf2, indexOf2 + 1, " ");
                        charSequence.setSpan(new do4(cmb.o7, fj1Var.getResourceProvider()), 0, indexOf2, 33);
                    }
                    z5c[] z5cVarArr2 = (z5c[]) charSequence.getSpans(0, charSequence.length(), z5c.class);
                    EditTextBoldCursor editTextBoldCursor = fj1Var.y;
                    String obj2 = (editTextBoldCursor == null || editTextBoldCursor.getText() == null) ? "" : fj1Var.y.getText().toString();
                    while (i < z5cVarArr2.length) {
                        charSequence.setSpan(new q1((Object) this, (Object) obj2, (byte) 2), charSequence.getSpanStart(z5cVarArr2[i]), charSequence.getSpanEnd(z5cVarArr2[i]), 33);
                        charSequence.removeSpan(z5cVarArr2[i]);
                        i++;
                    }
                }
                super.setText(charSequence, bufferType);
                break;
            case 2:
                super.setText(gw3.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
                break;
            default:
                super.setText(charSequence, bufferType);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf1(njb njbVar, Context context, i66 i66Var, ylb ylbVar) {
        super(context, i66Var, ylbVar);
        this.M = (byte) 3;
        this.N = njbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf1(UndoView undoView, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.M = (byte) 4;
        this.N = undoView;
    }
}
