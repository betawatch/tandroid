package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import di.v6;
import hi.o7;
import hi.r7;
import java.util.ArrayList;
import org.telegram.messenger.b20;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Wallet.j9;
import org.telegram.ui.Wallet.o5;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d extends q2 {
    public final ArrayList D0;
    public o7 E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public b J0;
    public a K0;
    public w10 L0;
    public w10 M0;
    public final o5 N0;
    public c O0;
    public float P0;

    public d(Context context, PointF pointF, int i7, sg.g1 g1Var) {
        super(context, pointF, i7, "", g1Var, 3);
        this.D0 = new ArrayList();
        this.N0 = new o5(this, 6);
        this.P0 = -1.0f;
        getEditText().setMaxLines(3);
        getEditText().setTallFrame(true);
        getEditText().addTextChangedListener(new j9(this, 6));
    }

    public static void v(f fVar, int i7) {
        if (i7 != 3) {
            fVar.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        } else {
            float textSize = fVar.getTextSize();
            fVar.setShadowLayer(Math.max(1.0f, 0.09f * textSize), 0.0f, textSize * 0.025f, TLObject.FLAG_31);
        }
    }

    public float getLineWidth() {
        return (this.I0 - getEditText().getPaddingLeft()) - getEditText().getPaddingRight();
    }

    public ArrayList<o7> getSegments() {
        return this.D0;
    }

    @Override // tg.q2
    public float getSelectionWidth() {
        float f10 = this.P0;
        return f10 >= 0.0f ? f10 : super.getSelectionWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o5 o5Var = this.N0;
        removeCallbacks(o5Var);
        postOnAnimation(o5Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.N0);
        super.onDetachedFromWindow();
    }

    @Override // tg.q2
    public final void q() {
        if (!this.G0) {
            this.G0 = true;
            getEditText().setSpokenWords(null);
            w10 w10Var = this.L0;
            if (w10Var != null) {
                w10Var.a(Boolean.TRUE);
            }
        }
        super.q();
    }

    @Override // tg.q2
    public final void r() {
        super.r();
        if (this.G0) {
            this.G0 = false;
            w10 w10Var = this.L0;
            if (w10Var != null) {
                w10Var.a(Boolean.FALSE);
            }
            z();
        }
    }

    @Override // tg.q2
    public final void s() {
        super.s();
        if (getEditText() != null) {
            v(getEditText(), getType());
        }
    }

    @Override // tg.q2
    public void setBaseFontSize(int i7) {
        super.setBaseFontSize(i7);
        v(getEditText(), getType());
    }

    public void setLoading(boolean z10) {
        if (this.F0 == z10) {
            return;
        }
        this.F0 = z10;
        t();
    }

    @Override // tg.q2
    public void setMaxWidth(int i7) {
        this.I0 = i7;
        super.setMaxWidth(i7);
    }

    public void setOnEditing(w10 w10Var) {
        this.L0 = w10Var;
    }

    public void setOnSeek(w10 w10Var) {
        this.M0 = w10Var;
    }

    public void setPendingProvider(a aVar) {
        this.K0 = aVar;
    }

    public void setPositionProvider(b bVar) {
        this.J0 = bVar;
    }

    public void setRangeProvider(c cVar) {
        this.O0 = cVar;
    }

    public void setSegments(ArrayList<o7> arrayList) {
        ArrayList<o7> arrayList2 = this.D0;
        if (arrayList != arrayList2) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        o7 o7Var = this.E0;
        if (o7Var != null && !arrayList2.contains(o7Var) && !this.G0) {
            this.E0 = null;
        }
        z();
    }

    public void setSelectionWidth(float f10) {
        if (this.P0 == f10) {
            return;
        }
        this.P0 = f10;
        m();
    }

    @Override // tg.q2
    public final void t() {
        f editText = getEditText();
        if (editText == null) {
            return;
        }
        if (!this.F0 || editText.getText().length() > 0) {
            editText.setHint((CharSequence) null);
        } else {
            editText.setHint("…");
            editText.setHintTextColor(-1711276033);
        }
    }

    public final void u(long j3, long j10, String str, int[] iArr) {
        o7 o7Var = new o7();
        o7Var.a = j3;
        o7Var.b = j10;
        o7Var.c = str;
        o7Var.d = iArr;
        o7Var.e = true;
        this.D0.add(o7Var);
    }

    public final o7 w(int i7) {
        int i10;
        o7 o7Var = this.E0;
        ArrayList arrayList = this.D0;
        int indexOf = o7Var == null ? -1 : arrayList.indexOf(o7Var);
        if (indexOf < 0 || (i10 = indexOf + i7) < 0 || i10 >= arrayList.size()) {
            return null;
        }
        o7 o7Var2 = (o7) arrayList.get(i10);
        c cVar = this.O0;
        if (cVar != null) {
            long N1 = ((hi.a0) ((ob.c) cVar).b).a.N1();
            long Z0 = ((hi.a0) ((ob.c) this.O0).b).a.Z0();
            if (o7Var2.b <= N1) {
                return null;
            }
            if (Z0 > N1 && o7Var2.a >= Z0) {
                return null;
            }
        }
        return o7Var2;
    }

    public final CharSequence x(int i7) {
        o7 w10 = this.G0 ? w(i7) : null;
        if (w10 == null) {
            return null;
        }
        CharSequence charSequence = w10.c;
        return charSequence == null ? "" : charSequence;
    }

    public final void y(int i7, int i10, ArrayList arrayList) {
        float f10;
        float f11;
        float f12;
        d dVar = this;
        int i11 = i7;
        ArrayList arrayList2 = dVar.D0;
        if (arrayList2.isEmpty() || i11 <= 0 || i10 <= 0) {
            return;
        }
        f fVar = new f(dVar.getContext());
        fVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int i12 = 0;
        fVar.setBackgroundColor(0);
        fVar.setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        Typeface d = dVar.getTypeface() != null ? dVar.getTypeface().d() : null;
        if (d != null) {
            fVar.setTypeface(d);
        }
        fVar.setTextSize(0, dVar.getTextSize());
        fVar.setBreakStrategy(0);
        if (dVar.getType() != 3) {
            fVar.setFrameColor(-16777216);
        }
        fVar.setHorizontallyScrolling(false);
        fVar.setMaxLines(3);
        int i13 = dVar.I0;
        if (i13 > 0) {
            fVar.setMaxWidth(i13);
        }
        float f13 = 2.0f;
        float width = (dVar.getWidth() / 2.0f) + dVar.getX();
        float height = (dVar.getHeight() / 2.0f) + dVar.getY();
        float scaleX = dVar.getScaleX();
        int i14 = 0;
        while (i14 < arrayList2.size()) {
            o7 o7Var = (o7) arrayList2.get(i14);
            CharSequence charSequence = o7Var.c;
            String charSequence2 = charSequence == null ? "" : charSequence.toString();
            if (charSequence2.trim().isEmpty()) {
                f10 = width;
            } else {
                f10 = width;
                if (o7Var.b > o7Var.a) {
                    fVar.setText(charSequence2);
                    int i15 = dVar.I0;
                    fVar.measure(i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_31) : View.MeasureSpec.makeMeasureSpec(i12, i12), View.MeasureSpec.makeMeasureSpec(i12, i12));
                    int measuredWidth = fVar.getMeasuredWidth() + 1;
                    int measuredHeight = fVar.getMeasuredHeight();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        b20 b20Var = new b20();
                        b20Var.a = (byte) 11;
                        f12 = f13;
                        f11 = height;
                        b20Var.V = o7Var.a;
                        b20Var.W = o7Var.b;
                        int[] iArr = o7Var.d;
                        b20Var.X = iArr == null ? null : (int[]) iArr.clone();
                        b20Var.j = charSequence2;
                        b20Var.b = (byte) dVar.getType();
                        b20Var.l = dVar.getSwatch().a;
                        b20Var.m = dVar.getTextSize();
                        b20Var.n = dVar.getTypeface();
                        b20Var.p = dVar.getAlign();
                        b20Var.q = measuredWidth;
                        b20Var.r = measuredHeight;
                        float f14 = measuredWidth;
                        float f15 = f14 * scaleX;
                        float f16 = i11;
                        b20Var.f = f15 / f16;
                        float f17 = measuredHeight;
                        float f18 = f17 * scaleX;
                        float f19 = i10;
                        b20Var.g = f18 / f19;
                        b20Var.c = (f10 - (f15 / f12)) / f16;
                        b20Var.d = (f11 - (f18 / f12)) / f19;
                        b20Var.e = (float) ((-dVar.getRotation()) * 0.017453292519943295d);
                        b20Var.y = f10 / f16;
                        b20Var.z = f11 / f19;
                        b20Var.w = f14 / f16;
                        b20Var.x = f17 / f19;
                        b20Var.v = scaleX;
                        arrayList.add(b20Var);
                        i14++;
                        dVar = this;
                        i11 = i7;
                        f13 = f12;
                        width = f10;
                        height = f11;
                        i12 = 0;
                    }
                }
            }
            f12 = f13;
            f11 = height;
            i14++;
            dVar = this;
            i11 = i7;
            f13 = f12;
            width = f10;
            height = f11;
            i12 = 0;
        }
    }

    public final void z() {
        b bVar;
        o7 o7Var;
        CharSequence charSequence;
        boolean z10;
        if (this.G0 || (bVar = this.J0) == null || this.s) {
            return;
        }
        long j3 = bVar.get();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.D0;
            if (i7 >= arrayList.size()) {
                o7Var = null;
                break;
            }
            o7Var = (o7) arrayList.get(i7);
            if (j3 >= o7Var.a && j3 < o7Var.b) {
                break;
            } else {
                i7++;
            }
        }
        a aVar = this.K0;
        if (aVar != null) {
            if (o7Var == null) {
                r7 r7Var = (r7) ((v6) aVar).b;
                if (r7Var.o && !r7Var.h && !r7Var.e(r7.a(j3))) {
                    r7Var.f();
                    z10 = true;
                    setLoading(z10);
                }
            }
            z10 = false;
            setLoading(z10);
        }
        if (o7Var == null || (charSequence = o7Var.c) == null) {
            charSequence = "";
        }
        if (o7Var != this.E0 || !TextUtils.equals(charSequence, getText())) {
            this.E0 = o7Var;
            this.H0 = true;
            setText(charSequence);
            this.H0 = false;
        }
        getEditText().setSpokenWords(o7Var != null ? o7Var.d : null);
        getEditText().A(j3);
    }
}
