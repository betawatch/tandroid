package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.gr;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class j0 extends LinearLayout implements hh.a, fe.l {
    public final p6 a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public g0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable w;
    public int x;
    public final fe.m y;

    public j0(Context context, p6 p6Var) {
        super(context);
        this.n = new ArrayList();
        this.w = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.y = new fe.m(this, gr.h, 320L);
        this.a = p6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        scrollView.addView(frameLayout);
        e();
    }

    @Override // fe.l
    public final void b(fe.m mVar) {
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            float c10 = hVar.c();
            Object obj = hVar.a;
            float T1 = org.telegram.messenger.i0.T1(0.7f, 1.0f, c10);
            ((i0) obj).setAlpha(c10);
            ((i0) obj).setScaleX(T1);
            ((i0) obj).setScaleY(T1);
        }
    }

    @Override // hh.a
    public final void c(int i10) {
        if (this.s == i10) {
            return;
        }
        this.s = i10;
        ScrollView scrollView = this.r;
        if (scrollView.getPaddingBottom() != i10) {
            scrollView.setPadding(0, 0, 0, i10);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float R0 = org.telegram.messenger.i0.R0(this.s);
        if (R0 > 0.0f) {
            int r12 = t6.r1(R0, t6.w0(t6.wf, this.a));
            int i10 = this.x;
            GradientDrawable gradientDrawable = this.w;
            if (i10 != r12) {
                gradientDrawable.setColors(new int[]{r12, t6.r1(0.66f, r12), i0.b.o(r12, 0)});
                this.x = r12;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        org.telegram.messenger.i0.y3(this.r, t6.w0(t6.wf, this.a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((h0) arrayList.get(i10)).a();
                i10++;
            }
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.c;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.f) {
            return this.e;
        }
        return m5.D(4.0f, this.c.rows.size() - 1, org.telegram.messenger.i0.L(16.0f) + (org.telegram.messenger.i0.L(this.h) * tL_replyKeyboardMarkup.rows.size()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if (r4 <= 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6.readByte(true) == r7.readByte(true)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setButtons(TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup) {
        int objectSize;
        int objectSize2;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup2 = this.c;
        if (tL_replyKeyboardMarkup == tL_replyKeyboardMarkup2) {
            return;
        }
        if (tL_replyKeyboardMarkup != null && tL_replyKeyboardMarkup2 != null && (objectSize = tL_replyKeyboardMarkup.getObjectSize()) == (objectSize2 = tL_replyKeyboardMarkup2.getObjectSize())) {
            try {
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
                tL_replyKeyboardMarkup.serializeToStream(nativeByteBuffer);
                nativeByteBuffer.rewind();
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(objectSize2);
                tL_replyKeyboardMarkup2.serializeToStream(nativeByteBuffer2);
                nativeByteBuffer2.rewind();
                while (true) {
                    if (objectSize < 8) {
                        break;
                    } else if (nativeByteBuffer.readInt64(true) != nativeByteBuffer2.readInt64(true)) {
                        break;
                    } else {
                        objectSize -= 8;
                    }
                }
            } catch (Throwable th2) {
                throw new RuntimeException(th2);
            }
        }
        this.c = tL_replyKeyboardMarkup;
        ArrayList arrayList = this.n;
        arrayList.clear();
        ScrollView scrollView = this.r;
        float scrollY = scrollView.getScrollY();
        fe.m mVar = this.y;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            i0 i0Var = (i0) ((fe.h) it.next()).a;
            i0Var.setTranslationY(i0Var.getTranslationY() - scrollY);
        }
        int i10 = 0;
        scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.c.rows.isEmpty()) {
            mVar.a.q(null, true);
            return;
        }
        i0 i0Var2 = new i0(getContext());
        i0Var2.setOrientation(1);
        float f7 = 0.0f;
        i0Var2.setAlpha(0.0f);
        this.b.addView(i0Var2);
        boolean z10 = tL_replyKeyboardMarkup.resize;
        this.f = !z10;
        float f10 = 4.0f;
        this.h = z10 ? 44 : (int) Math.max(44.0f, (z20.A(4.0f, this.c.rows.size() - 1, this.e - org.telegram.messenger.i0.L(16.0f)) / this.c.rows.size()) / org.telegram.messenger.i0.p);
        int i11 = 0;
        while (i11 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i11);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i10);
            i0Var2.addView(linearLayout, b6.k(8.0f, i11 == 0 ? 8.0f : f10, 8.0f, i11 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : f7, -1, this.h));
            float size = 1.0f / keyboardButtonRow.buttons.size();
            int i12 = i10;
            while (i12 < keyboardButtonRow.buttons.size()) {
                h0 h0Var = new h0(this, getContext(), keyboardButtonRow.buttons.get(i12));
                boolean z11 = i12 == 0;
                boolean z12 = i11 == 0;
                boolean z13 = i12 == keyboardButtonRow.buttons.size() - 1;
                boolean z14 = i11 == tL_replyKeyboardMarkup.rows.size() - 1;
                h0Var.d = z11;
                h0Var.e = z12;
                h0Var.f = z13;
                h0Var.h = z14;
                h0Var.a();
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(h0Var, b6.c(-1.0f, -1));
                linearLayout.addView(frameLayout, b6.m(size, 0, -1, 0, i12 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                h0Var.setOnClickListener(new rh.s(this, 25));
                e6.b(h0Var, 0.02f, 1.5f);
                arrayList.add(h0Var);
                h0Var.a();
                i12++;
            }
            i11++;
            i10 = 0;
            f7 = 0.0f;
            f10 = 4.0f;
        }
        mVar.l(i0Var2, true);
    }

    public void setDelegate(g0 g0Var) {
        this.d = g0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.e = i10;
        if (!this.f || (tL_replyKeyboardMarkup = this.c) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int max = !this.f ? 44 : (int) Math.max(44.0f, (z20.A(4.0f, this.c.rows.size() - 1, this.e - org.telegram.messenger.i0.L(16.0f)) / this.c.rows.size()) / org.telegram.messenger.i0.p);
        this.h = max;
        int L = org.telegram.messenger.i0.L(max);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            int childCount = ((i0) hVar.a).getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ((i0) hVar.a).getChildAt(i11);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != L) {
                    layoutParams.height = L;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // fe.l
    public final /* synthetic */ void a() {
    }

    @Override // hh.a
    public final void d(float f7) {
    }
}
