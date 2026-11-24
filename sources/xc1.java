// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xc1 extends i07 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public View F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean M;
    public r07 N;
    public ViewTreeObserver O;
    public j07 P;
    public boolean Q;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final up r = new up(this, 2);
    public final wc s = new wc(this, 5);
    public final lj9 w = new lj9((Object) this, (byte) 14);
    public int x = 0;
    public int y = 0;
    public boolean L = false;

    public xc1(Context context, View view, int i, boolean z) {
        this.b = context;
        this.E = view;
        this.d = i;
        this.e = z;
        WeakHashMap weakHashMap = jdc.a;
        this.G = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // vga
    public final boolean a() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((wc1) arrayList.get(0)).a.P.isShowing();
    }

    @Override // s07
    public final boolean b(bab babVar) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wc1 wc1Var = (wc1) obj;
            if (babVar == wc1Var.b) {
                wc1Var.a.c.requestFocus();
                return true;
            }
        }
        if (!babVar.hasVisibleItems()) {
            return false;
        }
        l(babVar);
        r07 r07Var = this.N;
        if (r07Var != null) {
            r07Var.J(babVar);
        }
        return true;
    }

    @Override // s07
    public final boolean c() {
        return false;
    }

    @Override // s07
    public final void d(yz6 yz6Var, boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (yz6Var == ((wc1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < arrayList.size()) {
                ((wc1) arrayList.get(i2)).b.c(false);
            }
            wc1 wc1Var = (wc1) arrayList.remove(i);
            yz6 yz6Var2 = wc1Var.b;
            q07 q07Var = wc1Var.a;
            np npVar = q07Var.P;
            yz6Var2.r(this);
            if (this.Q) {
                m07.b(npVar, null);
                npVar.setAnimationStyle(0);
            }
            q07Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.G = ((wc1) arrayList.get(size2 - 1)).c;
            } else {
                View view = this.E;
                WeakHashMap weakHashMap = jdc.a;
                this.G = view.getLayoutDirection() == 1 ? 0 : 1;
            }
            if (size2 != 0) {
                if (z) {
                    ((wc1) arrayList.get(0)).b.c(false);
                    return;
                }
                return;
            }
            dismiss();
            r07 r07Var = this.N;
            if (r07Var != null) {
                r07Var.d(yz6Var, true);
            }
            ViewTreeObserver viewTreeObserver = this.O;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.O.removeGlobalOnLayoutListener(this.r);
                }
                this.O = null;
            }
            this.F.removeOnAttachStateChangeListener(this.s);
            this.P.onDismiss();
        }
    }

    @Override // vga
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            wc1[] wc1VarArr = (wc1[]) arrayList.toArray(new wc1[size]);
            for (int i = size - 1; i >= 0; i--) {
                wc1 wc1Var = wc1VarArr[i];
                if (wc1Var.a.P.isShowing()) {
                    wc1Var.a.dismiss();
                }
            }
        }
    }

    @Override // vga
    public final er3 e() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((wc1) b00.f(1, arrayList)).a.c;
    }

    @Override // vga
    public final void f() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((yz6) obj);
        }
        arrayList.clear();
        View view = this.E;
        this.F = view;
        if (view != null) {
            boolean z = this.O == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.O = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.r);
            }
            this.F.addOnAttachStateChangeListener(this.s);
        }
    }

    @Override // s07
    public final void h(r07 r07Var) {
        this.N = r07Var;
    }

    @Override // s07
    public final void j() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((wc1) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((vz6) adapter).notifyDataSetChanged();
        }
    }

    @Override // i07
    public final void l(yz6 yz6Var) {
        yz6Var.b(this, this.b);
        if (a()) {
            u(yz6Var);
        } else {
            this.h.add(yz6Var);
        }
    }

    @Override // i07
    public final void n(View view) {
        if (this.E != view) {
            this.E = view;
            int i = this.x;
            WeakHashMap weakHashMap = jdc.a;
            this.y = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // i07
    public final void o(boolean z) {
        this.L = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        wc1 wc1Var;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                wc1Var = null;
                break;
            }
            wc1Var = (wc1) arrayList.get(i);
            if (!wc1Var.a.P.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (wc1Var != null) {
            wc1Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // i07
    public final void p(int i) {
        if (this.x != i) {
            this.x = i;
            View view = this.E;
            WeakHashMap weakHashMap = jdc.a;
            this.y = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // i07
    public final void q(int i) {
        this.H = true;
        this.J = i;
    }

    @Override // i07
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.P = (j07) onDismissListener;
    }

    @Override // i07
    public final void s(boolean z) {
        this.M = z;
    }

    @Override // i07
    public final void t(int i) {
        this.I = true;
        this.K = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(yz6 yz6Var) {
        boolean z;
        boolean z2;
        View view;
        wc1 wc1Var;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem menuItem;
        vz6 vz6Var;
        int i4;
        int firstVisiblePosition;
        Context context = this.b;
        ?? from = LayoutInflater.from(context);
        vz6 vz6Var2 = new vz6(yz6Var, from, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.L) {
            vz6Var2.c = true;
        } else if (a()) {
            int size = yz6Var.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = yz6Var.getItem(i5);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            vz6Var2.c = z;
        }
        int m = i07.m(vz6Var2, context, this.c);
        q07 q07Var = new q07(context, null, this.d);
        q07Var.T = this.w;
        q07Var.G = this;
        np npVar = q07Var.P;
        npVar.setOnDismissListener(this);
        q07Var.F = this.E;
        q07Var.x = this.y;
        q07Var.O = true;
        npVar.setFocusable(true);
        npVar.setInputMethodMode(2);
        q07Var.o(vz6Var2);
        q07Var.r(m);
        q07Var.x = this.y;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            wc1Var = (wc1) b00.f(1, arrayList);
            yz6 yz6Var2 = wc1Var.b;
            int size2 = yz6Var2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = yz6Var2.getItem(i6);
                if (menuItem.hasSubMenu() && yz6Var == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem == null) {
                view = null;
                z2 = 0;
            } else {
                er3 er3Var = wc1Var.a.c;
                ListAdapter adapter = er3Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    vz6Var = (vz6) headerViewListAdapter.getWrappedAdapter();
                } else {
                    vz6Var = (vz6) adapter;
                    i4 = 0;
                }
                int count = vz6Var.getCount();
                int i7 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == vz6Var.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                view = (i7 == -1 || (firstVisiblePosition = (i7 + i4) - er3Var.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= er3Var.getChildCount()) ? null : er3Var.getChildAt(firstVisiblePosition);
            }
        } else {
            z2 = 0;
            view = null;
            wc1Var = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = q07.U;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(npVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                n07.a(npVar, z2);
            }
            m07.a(npVar, null);
            er3 er3Var2 = ((wc1) arrayList.get(arrayList.size() - 1)).a.c;
            int[] iArr = new int[2];
            er3Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.F.getWindowVisibleDisplayFrame(rect);
            if (this.G == 1) {
                if (er3Var2.getWidth() + iArr[0] + m > rect.right) {
                    i = 0;
                    boolean z3 = i != 1;
                    this.G = i;
                    if (Build.VERSION.SDK_INT < 26) {
                        q07Var.F = view;
                        i2 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.E.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.y & 7) == 5) {
                            iArr2[0] = this.E.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        int i8 = iArr3[0] - iArr2[0];
                        i2 = iArr3[1] - iArr2[1];
                        i3 = i8;
                    }
                    if ((this.y & 5) == 5) {
                        if (z3) {
                            width = i3 + view.getWidth();
                            q07Var.f = width;
                            q07Var.w = true;
                            q07Var.s = true;
                            q07Var.k(i2);
                        }
                        width = i3 - m;
                        q07Var.f = width;
                        q07Var.w = true;
                        q07Var.s = true;
                        q07Var.k(i2);
                    } else if (z3) {
                        width = i3 + m;
                        q07Var.f = width;
                        q07Var.w = true;
                        q07Var.s = true;
                        q07Var.k(i2);
                    } else {
                        m = view.getWidth();
                        width = i3 - m;
                        q07Var.f = width;
                        q07Var.w = true;
                        q07Var.s = true;
                        q07Var.k(i2);
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.G = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.y & 5) == 5) {
                }
            } else {
                if (iArr[0] - m >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.G = i;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.y & 5) == 5) {
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.G = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.y & 5) == 5) {
                }
            }
        } else {
            if (this.H) {
                q07Var.f = this.J;
            }
            if (this.I) {
                q07Var.k(this.K);
            }
            Rect rect2 = this.a;
            q07Var.N = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new wc1(q07Var, yz6Var, this.G));
        q07Var.f();
        er3 er3Var3 = q07Var.c;
        er3Var3.setOnKeyListener(this);
        if (wc1Var == null && this.M && yz6Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, er3Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(yz6Var.m);
            er3Var3.addHeaderView(frameLayout, null, false);
            q07Var.f();
        }
    }
}
