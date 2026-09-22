package yh;

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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w01;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class n8 extends View {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final Paint d;
    public final org.telegram.ui.Components.d6 e;
    public float f;
    public m8 h;
    public Utilities.Callback n;
    public final /* synthetic */ o8 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(o8 o8Var, Context context, boolean z10) {
        super(context);
        this.r = o8Var;
        this.b = new ArrayList();
        this.c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 320L, qr.h);
        this.a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, o8Var.b));
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
            ((m8) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((m8) arrayList.get(i11)).a(canvas);
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
            ((m8) arrayList.get(i10)).k.onAttachedToWindow();
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
            ((m8) arrayList.get(i10)).k.onDetachedFromWindow();
            i10++;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m8 m8Var;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            m8 m8Var2 = this.h;
            if (m8Var2 != null) {
                m8Var2.q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((m8) arrayList.get(i10)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (m8) arrayList.get(i10);
                    break;
                }
                i10++;
            }
            m8 m8Var3 = this.h;
            if (m8Var3 != null) {
                m8Var3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (m8Var = this.h) != null && !m8Var.p && m8Var.b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.n) != null) {
                callback.run(Long.valueOf(this.h.j));
            }
            m8 m8Var4 = this.h;
            if (m8Var4 != null) {
                m8Var4.q.c(false);
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
            m8 m8Var = (m8) arrayList.get(i10);
            if (m8Var.i) {
                m8Var.b(j3);
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
    /* JADX WARN: Type inference failed for: r9v5, types: [yh.m8] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, yh.m8] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, yh.m8] */
    /* JADX WARN: Type inference failed for: r9v9, types: [yh.m8] */
    public void setSenders(ArrayList<j8> arrayList) {
        ArrayList arrayList2;
        oq[] oqVarArr;
        ?? r72;
        ?? r82;
        ?? r92;
        ArrayList<j8> arrayList3 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.b;
            int size = arrayList2.size();
            oqVarArr = null;
            j8 j8Var = null;
            r72 = this.c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            m8 m8Var = (m8) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                j8 j8Var2 = arrayList3.get(i11);
                boolean z10 = j8Var2.b;
                if ((z10 && m8Var.i) || (!m8Var.i && !z10 && j8Var2.c == m8Var.j)) {
                    j8Var = arrayList3.get(i11);
                    break;
                }
            }
            if (j8Var == null) {
                m8Var.k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                m8Var.a = -1;
                r72.add(m8Var);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList3.size()) {
            j8 j8Var3 = arrayList3.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                m8 m8Var2 = (m8) arrayList2.get(i13);
                boolean z11 = m8Var2.i;
                if ((z11 && j8Var3.b) || (!z11 && !j8Var3.b && m8Var2.j == j8Var3.c)) {
                    r92 = (m8) arrayList2.get(i13);
                    break;
                }
            }
            r92 = oqVarArr;
            if (r92 == null) {
                for (int i14 = 0; i14 < r72.size(); i14++) {
                    m8 m8Var3 = (m8) r72.get(i14);
                    boolean z12 = m8Var3.i;
                    if ((z12 && j8Var3.b) || (!z12 && !j8Var3.b && m8Var3.j == j8Var3.c)) {
                        r92 = (m8) r72.get(i14);
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
                r92 = new m8(this, j8Var3.b, j8Var3.c);
                r92.d.d(0.0f, r82);
                arrayList2.add(r92);
                r92.c.d((arrayList3.size() - r82) - i12, r82);
            }
            n8 n8Var = r92.w;
            o8 o8Var = n8Var.r;
            r92.a = (arrayList3.size() - r82) - i12;
            long j3 = j8Var3.d;
            Paint paint = r92.h;
            r92.o = new w01(w7.R0(hg.k0.j(j3, ',', new StringBuilder("⭐️")), 0.85f, oqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = n8Var.a;
            int i15 = o8Var.c;
            if (z13) {
                int i16 = (int) j3;
                r92.f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                r92.r = i0.a.d(0.5f, ai.g0.b(i15, i16, 4), ai.g0.b(i15, i16, 3));
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
                r92.u = new w01(hg.k0.h(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && r92.s == null) {
                    Drawable mutate = n8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    r92.s = mutate;
                    int i18 = r92.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = n8Var.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    r92.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, o8Var.b), mode));
                }
            }
            if (j8Var3.b) {
                r92.b(this.r.E);
            } else {
                boolean z14 = j8Var3.a;
                if (!r92.i && r92.p != z14) {
                    r92.p = z14;
                    oqVarArr = null;
                    r92.n = new w01(z14 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r92.j), 12.0f, null);
                    n8Var.invalidate();
                    i12++;
                    arrayList3 = arrayList;
                    r82 = 1;
                }
            }
            oqVarArr = null;
            i12++;
            arrayList3 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
