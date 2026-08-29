package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import i7.f6;
import i7.h6;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class l0 extends LinearLayout implements ah.a, vd.j {
    public final c6 a;
    public final FrameLayout b;
    public TLRPC.TL_replyKeyboardMarkup c;
    public i0 d;
    public int e;
    public boolean f;
    public int h;
    public final ArrayList n;
    public final ScrollView r;
    public int s;
    public final GradientDrawable v;
    public int w;
    public final vd.k x;

    public l0(Context context, c6 c6Var) {
        super(context);
        this.n = new ArrayList();
        this.v = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
        this.x = new vd.k(this, jr.h, 320L);
        this.a = c6Var;
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

    @Override // vd.j
    public final void b(vd.k kVar) {
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            float c3 = fVar.c();
            Object obj = fVar.a;
            float lerp = AndroidUtilities.lerp(0.7f, 1.0f, c3);
            ((k0) obj).setAlpha(c3);
            ((k0) obj).setScaleX(lerp);
            ((k0) obj).setScaleY(lerp);
        }
    }

    @Override // ah.a
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
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.s);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int l1 = g6.l1(navigationBarThirdButtonsFactor, g6.v0(g6.He, this.a));
            int i10 = this.w;
            GradientDrawable gradientDrawable = this.v;
            if (i10 != l1) {
                gradientDrawable.setColors(new int[]{l1, g6.l1(0.66f, l1), i0.a.k(l1, 0)});
                this.w = l1;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.s, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public final void e() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.r, g6.v0(g6.He, this.a));
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.n;
            if (i10 >= arrayList.size()) {
                invalidate();
                return;
            } else {
                ((j0) arrayList.get(i10)).a();
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
        return org.telegram.messenger.x3.D(4.0f, this.c.rows.size() - 1, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.h) * tL_replyKeyboardMarkup.rows.size()));
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
        vd.k kVar = this.x;
        Iterator it = kVar.iterator();
        while (it.hasNext()) {
            k0 k0Var = (k0) ((vd.f) it.next()).a;
            k0Var.setTranslationY(k0Var.getTranslationY() - scrollY);
        }
        int i10 = 0;
        scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.c.rows.isEmpty()) {
            kVar.a.r(null, true);
            return;
        }
        k0 k0Var2 = new k0(getContext());
        k0Var2.setOrientation(1);
        k0Var2.setAlpha(0.0f);
        this.b.addView(k0Var2);
        boolean z10 = tL_replyKeyboardMarkup.resize;
        this.f = !z10;
        this.h = z10 ? 44 : (int) Math.max(44.0f, (org.telegram.ui.b.z(4.0f, this.c.rows.size() - 1, this.e - AndroidUtilities.dp(16.0f)) / this.c.rows.size()) / AndroidUtilities.density);
        int i11 = 0;
        while (i11 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i11);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i10);
            k0Var2.addView(linearLayout, f6.k(8.0f, i11 == 0 ? 8.0f : 4.0f, 8.0f, i11 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : 0.0f, -1, this.h));
            float size = 1.0f / keyboardButtonRow.buttons.size();
            int i12 = 0;
            while (i12 < keyboardButtonRow.buttons.size()) {
                j0 j0Var = new j0(this, getContext(), keyboardButtonRow.buttons.get(i12));
                boolean z11 = i12 == 0;
                boolean z12 = i11 == 0;
                boolean z13 = i12 == keyboardButtonRow.buttons.size() - 1;
                boolean z14 = i11 == tL_replyKeyboardMarkup.rows.size() - 1;
                j0Var.d = z11;
                j0Var.e = z12;
                j0Var.f = z13;
                j0Var.h = z14;
                j0Var.a();
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(j0Var, f6.c(-1.0f, -1));
                linearLayout.addView(frameLayout, f6.m(size, 0, -1, 0, i12 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                j0Var.setOnClickListener(new mh.n(this, 14));
                h6.b(j0Var, 0.02f, 1.5f);
                arrayList.add(j0Var);
                j0Var.a();
                i12++;
            }
            i11++;
            i10 = 0;
        }
        kVar.i(k0Var2, true);
    }

    public void setDelegate(i0 i0Var) {
        this.d = i0Var;
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
            vd.f fVar = (vd.f) it.next();
            int childCount = ((k0) fVar.a).getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ((k0) fVar.a).getChildAt(i11);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != dp) {
                    layoutParams.height = dp;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    @Override // vd.j
    public final /* synthetic */ void a() {
    }

    @Override // ah.a
    public final void d(float f9) {
    }
}
