package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class q8 extends View {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final Paint d;
    public final org.telegram.ui.Components.d6 e;
    public float f;
    public p8 h;
    public Utilities.Callback n;
    public final /* synthetic */ r8 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(r8 r8Var, Context context, boolean z10) {
        super(context);
        this.r = r8Var;
        this.b = new ArrayList();
        this.c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 320L, wr.h);
        this.a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, r8Var.b));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.b;
        this.f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((p8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((p8) arrayList.get(i11)).a(canvas);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p8) arrayList.get(i10)).k.onAttachedToWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p8) arrayList.get(i10)).k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p8 p8Var;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            p8 p8Var2 = this.h;
            if (p8Var2 != null) {
                p8Var2.q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((p8) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (p8) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            p8 p8Var3 = this.h;
            if (p8Var3 != null) {
                p8Var3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (p8Var = this.h) != null && !p8Var.p && p8Var.b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.n) != null) {
                callback.run(Long.valueOf(this.h.j));
            }
            p8 p8Var4 = this.h;
            if (p8Var4 != null) {
                p8Var4.q.c(false);
            }
            this.h = null;
        }
        return this.h != null;
    }

    public void setMyPrivacy(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i10 >= arrayList.size()) {
                return;
            }
            p8 p8Var = (p8) arrayList.get(i10);
            if (p8Var.i) {
                p8Var.b(j3);
                return;
            }
            i10++;
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.n = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [org.telegram.ui.Components.d6] */
    /* JADX WARN: Type inference failed for: r11v4, types: [org.telegram.ui.Components.d6] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [xh.p8] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, xh.p8] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, xh.p8] */
    /* JADX WARN: Type inference failed for: r9v9, types: [xh.p8] */
    public void setSenders(ArrayList<m8> arrayList) {
        ArrayList arrayList2;
        uq[] uqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ArrayList<m8> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.b;
            int size = arrayList2.size();
            uqVarArr = null;
            m8 m8Var = null;
            r72 = this.c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            p8 p8Var = (p8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                m8 m8Var2 = arrayList3.get(i11);
                boolean z10 = m8Var2.b;
                if ((z10 && p8Var.i) || (!p8Var.i && !z10 && m8Var2.c == p8Var.j)) {
                    m8Var = arrayList3.get(i11);
                    break;
                }
            }
            if (m8Var == null) {
                p8Var.k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                p8Var.a = -1;
                r72.add(p8Var);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            m8 m8Var3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                p8 p8Var2 = (p8) arrayList2.get(i13);
                boolean z11 = p8Var2.i;
                if ((z11 && m8Var3.b) || (!z11 && !m8Var3.b && p8Var2.j == m8Var3.c)) {
                    r92 = (p8) arrayList2.get(i13);
                    break;
                }
            }
            r92 = uqVarArr;
            if (r92 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    p8 p8Var3 = (p8) r72.get(i14);
                    boolean z12 = p8Var3.i;
                    if ((z12 && m8Var3.b) || (!z12 && !m8Var3.b && p8Var3.j == m8Var3.c)) {
                        r92 = (p8) r72.get(i14);
                        break;
                    }
                }
                if (r92 != null) {
                    r72.remove(r92);
                    r92.k.onAttachedToWindow();
                    arrayList2.add(r92);
                }
            }
            if (r92 == null) {
                r92 = new p8(this, m8Var3.b, m8Var3.c);
                r92.d.d(0.0f, r82);
                arrayList2.add(r92);
                r92.c.d((arrayList3.size() - r82) - i12, r82);
            }
            q8 q8Var = r92.w;
            r8 r8Var = q8Var.r;
            r92.a = (arrayList3.size() - r82) - i12;
            long j3 = m8Var3.d;
            Paint paint = r92.h;
            r92.o = new t01(z7.R0(hc.b.l(j3, ',', new StringBuilder("⭐️")), 0.85f, uqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = q8Var.a;
            int i15 = r8Var.c;
            if (z13) {
                int i16 = (int) j3;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{zh.o.b(i15, i16, 4), zh.o.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.a.d(0.5f, zh.o.b(i15, i16, 4), zh.o.b(i15, i16, 3));
                paint.setShader(r92.f);
            } else {
                paint.setShader(null);
                r92.r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = r92.s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(r92.r, PorterDuff.Mode.SRC_IN));
            }
            if (this.a) {
                int i17 = i12 + 1;
                r92.v = i17;
                r92.u = new t01(hc.b.j(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && r92.s == null) {
                    Drawable mutate = q8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i18 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = q8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, r8Var.b), mode));
                }
            }
            if (m8Var3.b) {
                r92.b(this.r.E);
            } else {
                boolean z14 = m8Var3.a;
                if (!r92.i && r92.p != z14) {
                    r92.p = z14;
                    uqVarArr = null;
                    r92.n = new t01(z14 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r92.j), 12.0f, null);
                    q8Var.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    r82 = 1;
                }
            }
            uqVarArr = null;
            i12++;
            arrayList3 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
