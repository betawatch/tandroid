package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class m0 extends LinearLayout implements ch.a, xd.i {
    public final f6 a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public j0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable v;
    public int w;
    public final xd.j x;

    public m0(Context context, f6 f6Var) {
        super(context);
        this.n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.x = new xd.j(this, nr.h, 320L);
        this.a = f6Var;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.r = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        scrollView.addView(frameLayout);
        d();
    }

    @Override // ch.a
    public final void b(int i10) {
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

    public final void d() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.r, j6.v0(j6.He, this.a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((k0) arrayList.get(i10)).a();
                i10++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = j6.l1(navigationBarThirdButtonsFactor, j6.v0(j6.He, this.a));
            int i10 = this.w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, j6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    @Override // xd.i
    public final void e(xd.j jVar) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            float c3 = eVar.c();
            Object obj = eVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c3);
            ((l0) obj).setAlpha(c3);
            ((l0) obj).setScaleX(lerp);
            ((l0) obj).setScaleY(lerp);
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
        return org.telegram.messenger.y3.D(4.0f, this.c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        xd.j jVar = this.x;
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) ((xd.e) it.next()).a;
            l0Var.setTranslationY(l0Var.getTranslationY() - scrollY);
        }
        int i10 = 0;
        scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.c.rows.isEmpty()) {
            jVar.a.r(null, true);
            return;
        }
        l0 l0Var2 = new l0(getContext());
        l0Var2.setOrientation(1);
        l0Var2.setAlpha(0.0f);
        this.b.addView(l0Var2);
        boolean z4 = tL_replyKeyboardMarkup.resize;
        this.f = !z4;
        this.h = z4 ? 44 : (int) Math.max(44.0f, (org.telegram.ui.b.z(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        int i11 = 0;
        while (i11 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i11);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i10);
            l0Var2.addView(linearLayout, b6.k(8.0f, i11 == 0 ? 8.0f : 4.0f, 8.0f, i11 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : 0.0f, -1, this.h));
            float size = 1.0f / keyboardButtonRow.buttons.size();
            int i12 = 0;
            while (i12 < keyboardButtonRow.buttons.size()) {
                k0 k0Var = new k0(this, getContext(), keyboardButtonRow.buttons.get(i12));
                boolean z10 = i12 == 0;
                boolean z11 = i11 == 0;
                boolean z12 = i12 == keyboardButtonRow.buttons.size() - 1;
                boolean z13 = i11 == tL_replyKeyboardMarkup.rows.size() - 1;
                k0Var.d = z10;
                k0Var.e = z11;
                k0Var.f = z12;
                k0Var.h = z13;
                k0Var.a();
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(k0Var, b6.c(-1.0f, -1));
                linearLayout.addView(frameLayout, b6.m(size, 0, -1, 0, i12 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                k0Var.setOnClickListener(new oh.n(this, 14));
                d6.b(k0Var, 0.02f, 1.5f);
                arrayList.add(k0Var);
                k0Var.a();
                i12++;
            }
            i11++;
            i10 = 0;
        }
        jVar.i(l0Var2, true);
    }

    public void setDelegate(j0 j0Var) {
        this.d = j0Var;
    }

    public void setPanelHeight(int i10) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.e = i10;
        if (!this.f || (tL_replyKeyboardMarkup = this.c) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int max = !this.f ? 44 : (int) Math.max(44.0f, (org.telegram.ui.b.z(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        this.h = max;
        int dp = AndroidUtilities.dp(max);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            int childCount = ((l0) eVar.a).getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ((l0) eVar.a).getChildAt(i11);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != dp) {
                    layoutParams.height = dp;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // xd.i
    public final /* synthetic */ void a() {
    }

    @Override // ch.a
    public final void c(float f10) {
    }
}
