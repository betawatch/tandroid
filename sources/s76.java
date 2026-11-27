// default package

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class s76 implements oka {
    public static final Method Q;
    public static final Method R;
    public static final Method S;
    public u43 E;
    public View F;
    public AdapterView.OnItemClickListener G;
    public final Handler L;
    public Rect N;
    public boolean O;
    public final op P;
    public final Context a;
    public ListAdapter b;
    public vr3 c;
    public int f;
    public int h;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int d = -2;
    public int e = -2;
    public final short n = 1002;
    public int x = 0;
    public final int y = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public final q76 H = new q76(this, 1);
    public final k14 I = new k14(this, 3);
    public final r76 J = new r76(this);
    public final q76 K = new q76(this, 0);
    public final Rect M = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
            try {
                Q = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                S = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                R = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public s76(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.a = context;
        this.L = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w19.o, i, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.r = true;
        }
        obtainStyledAttributes.recycle();
        op opVar = new op(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, w19.s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            opVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        opVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : yqd.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.P = opVar;
        opVar.setInputMethodMode(1);
    }

    @Override // oka
    public final boolean a() {
        return this.P.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void c(int i) {
        this.f = i;
    }

    @Override // oka
    public final vr3 d() {
        return this.c;
    }

    @Override // oka
    public final void dismiss() {
        op opVar = this.P;
        opVar.dismiss();
        opVar.setContentView(null);
        this.c = null;
        this.L.removeCallbacks(this.H);
    }

    public final Drawable f() {
        return this.P.getBackground();
    }

    @Override // oka
    public final void g() {
        int i;
        int a;
        int paddingBottom;
        vr3 vr3Var;
        vr3 vr3Var2 = this.c;
        Context context = this.a;
        op opVar = this.P;
        if (vr3Var2 == null) {
            vr3 o = o(context, !this.O);
            this.c = o;
            o.setAdapter(this.b);
            this.c.setOnItemClickListener(this.G);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new n76(this, (byte) 0));
            this.c.setOnScrollListener(this.J);
            opVar.setContentView(this.c);
        }
        Drawable background = opVar.getBackground();
        Rect rect = this.M;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.r) {
                this.h = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = opVar.getInputMethodMode() == 2;
        View view = this.F;
        int i3 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = R;
            if (method != null) {
                try {
                    a = ((Integer) method.invoke(opVar, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a = opVar.getMaxAvailableHeight(view, i3);
        } else {
            a = o76.a(opVar, view, i3, z);
        }
        int i4 = this.d;
        if (i4 == -1) {
            paddingBottom = a + i;
        } else {
            int i5 = this.e;
            int a2 = this.c.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_31), a);
            paddingBottom = a2 + (a2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z2 = opVar.getInputMethodMode() == 2;
        opVar.setWindowLayoutType(this.n);
        if (opVar.isShowing()) {
            View view2 = this.F;
            WeakHashMap weakHashMap = ihc.a;
            if (view2.isAttachedToWindow()) {
                int i6 = this.e;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.F.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    int i7 = this.e;
                    if (z2) {
                        opVar.setWidth(i7 == -1 ? -1 : 0);
                        opVar.setHeight(0);
                    } else {
                        opVar.setWidth(i7 == -1 ? -1 : 0);
                        opVar.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                opVar.setOutsideTouchable(true);
                View view3 = this.F;
                int i8 = i6;
                int i9 = this.f;
                int i10 = this.h;
                int i11 = i8 < 0 ? -1 : i8;
                if (i4 < 0) {
                    i4 = -1;
                }
                opVar.update(view3, i9, i10, i11, i4);
                return;
            }
            return;
        }
        int i12 = this.e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = this.F.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        opVar.setWidth(i12);
        opVar.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = Q;
            if (method2 != null) {
                try {
                    method2.invoke(opVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            p76.b(opVar, true);
        }
        opVar.setOutsideTouchable(true);
        opVar.setTouchInterceptor(this.I);
        if (this.w) {
            opVar.setOverlapAnchor(this.s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = S;
            if (method3 != null) {
                try {
                    method3.invoke(opVar, this.N);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            p76.a(opVar, this.N);
        }
        opVar.showAsDropDown(this.F, this.f, this.h, this.x);
        this.c.setSelection(-1);
        if ((!this.O || this.c.isInTouchMode()) && (vr3Var = this.c) != null) {
            vr3Var.setListSelectionHidden(true);
            vr3Var.requestLayout();
        }
        if (this.O) {
            return;
        }
        this.L.post(this.K);
    }

    public final void i(Drawable drawable) {
        this.P.setBackgroundDrawable(drawable);
    }

    public final void j(int i) {
        this.h = i;
        this.r = true;
    }

    public final int m() {
        if (this.r) {
            return this.h;
        }
        return 0;
    }

    public void n(ListAdapter listAdapter) {
        u43 u43Var = this.E;
        if (u43Var == null) {
            this.E = new u43(this, (byte) 1);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(u43Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.E);
        }
        vr3 vr3Var = this.c;
        if (vr3Var != null) {
            vr3Var.setAdapter(this.b);
        }
    }

    public vr3 o(Context context, boolean z) {
        return new vr3(context, z);
    }

    public final void p(int i) {
        Drawable background = this.P.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.M;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
