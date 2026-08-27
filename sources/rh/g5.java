package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import h7.z5;
import h7.z6;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.di1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g5 extends y implements org.telegram.ui.ActionBar.x5, i9 {
    public w2 A;
    public x5 B;
    public boolean C;
    public final LinkedHashSet D;
    public d5 E;
    public final h F;
    public final c6 n;
    public final d1 r;
    public final org.telegram.ui.i2 s;
    public final i5 v;
    public final f5 w;
    public final ArrayList x;
    public boolean y;

    public g5(Context context, c6 c6Var) {
        super(context);
        this.x = new ArrayList();
        this.D = new LinkedHashSet();
        this.F = new h(this, 3);
        this.n = c6Var;
        setClipChildren(false);
        setClipToPadding(false);
        d1 d1Var = new d1(context, c6Var);
        this.r = d1Var;
        d1Var.setAllowNewlines(false);
        d1Var.setInputType(147457);
        d1Var.setGravity(49);
        d1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        d1Var.setIncludeFontPadding(false);
        d1Var.setMinHeight(0);
        d1Var.setBackground(null);
        d1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        d1Var.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        d1Var.setCenterEmptyHint(true);
        d1Var.setListener(new o0.b(this, 18));
        d1Var.setDelegate(new lh.p(this, 27));
        addView(d1Var);
        org.telegram.ui.i2 i2Var = new org.telegram.ui.i2(this, context, 2);
        this.s = i2Var;
        i2Var.setClipChildren(false);
        i2Var.setClipToPadding(false);
        i2Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(i2Var, z5.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        i5 i5Var = new i5(context, c6Var);
        this.v = i5Var;
        f5 f5Var = new f5(this, context);
        this.w = f5Var;
        f5Var.addView(i5Var);
        i2Var.addView(f5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        d1 d1Var = this.r;
        d1Var.t();
        int v02 = g6.v0(g6.G6, this.n);
        d1Var.setTextColor(v02);
        d1Var.setHintTextColor(g6.l1(0.35f, v02));
        int i10 = 0;
        while (true) {
            i5 i5Var = this.v;
            if (i10 >= i5Var.getChildCount()) {
                i5Var.b();
                return;
            }
            View childAt = i5Var.getChildAt(i10);
            if (childAt instanceof j5) {
                ((j5) childAt).a.t();
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.B == null) {
            return;
        }
        w2 w2Var = this.A;
        j9 textSelectionHelper = w2Var != null ? w2Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.x;
        arrayList.clear();
        fillTextLayoutBlocks(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            u9 u9Var = (u9) arrayList.get(i10);
            canvas.save();
            canvas.translate(u9Var.getX(), u9Var.getY());
            textSelectionHelper.a0(canvas, this, i10);
            canvas.restore();
        }
    }

    @Override // rh.y
    public final void f(int i10) {
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.i9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var;
        Layout layout;
        if (this.B == null) {
            return;
        }
        d1 d1Var2 = this.r;
        Layout layout2 = d1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new b5(this, layout2, d1Var2.getPaddingLeft() + d1Var2.getLeft(), d1Var2.getPaddingTop() + d1Var2.getTop()));
        }
        int size = this.B.g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.B.g.get(i10);
            i5 i5Var = this.v;
            j5 m10 = i5Var.m(pagetablecell);
            if (m10 != null && (layout = (d1Var = m10.a).getLayout()) != null) {
                org.telegram.ui.i2 i2Var = this.s;
                int left = i2Var.getLeft();
                f5 f5Var = this.w;
                arrayList.add(new c5(layout, d1Var.getPaddingLeft() + d1Var.getLeft() + m10.getLeft() + ((i5Var.getLeft() + (f5Var.getLeft() + left)) - i2Var.getScrollX()), d1Var.getPaddingTop() + d1Var.getTop() + m10.getTop() + i5Var.getTop() + f5Var.getTop() + i2Var.getTop(), this.B.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public i5 getGrid() {
        return this.v;
    }

    public x5 getModel() {
        return this.B;
    }

    public a getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.D;
    }

    public d1 getTitleEditText() {
        return this.r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        x5 x5Var = this.B;
        if (x5Var == null || i10 <= 0 || i10 - 1 >= x5Var.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.B.g.get(i11);
    }

    public final void i(boolean z10) {
        int i10;
        int i11;
        int i12;
        if (this.B != null) {
            LinkedHashSet linkedHashSet = this.D;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z10) {
                Iterator it = linkedHashSet.iterator();
                i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i10 = Math.min(i10, this.B.a((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i10 = Math.max(i10, x5.n(pagetablecell) + this.B.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            x5 x5Var = this.B;
            if (x5Var.b == 0 || (i11 = x5Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = x5Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(x5.f());
                    pageblocktable.rows.add(pagetablerow);
                } else {
                    ArrayList<TL_iv.pageTableRow> arrayList2 = pageblocktable.rows;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TL_iv.pageTableRow pagetablerow2 = arrayList2.get(i13);
                        i13++;
                        TL_iv.pageTableRow pagetablerow3 = pagetablerow2;
                        if (pagetablerow3.cells == null) {
                            pagetablerow3.cells = new ArrayList<>();
                        }
                        pagetablerow3.cells.add(x5.f());
                    }
                }
                x5Var.i();
            } else {
                int i14 = i10 < 0 ? 0 : i10;
                if (i14 <= i11) {
                    i11 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[x5Var.b];
                ArrayList arrayList3 = x5Var.g;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = x5Var.b(pagetablecell2);
                    int a2 = x5Var.a(pagetablecell2);
                    int o10 = x5.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = a2 >= i11 ? a2 + 1 : a2;
                    if (a2 < i11 && a2 + i16 > i11) {
                        i16++;
                        for (int i18 = b10; i18 < b10 + o10 && i18 < x5Var.b; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i17, o10, i16});
                }
                int i19 = 0;
                while (true) {
                    i12 = x5Var.b;
                    if (i19 >= i12) {
                        break;
                    }
                    if (!zArr[i19]) {
                        identityHashMap.put(x5.f(), new int[]{i19, i11, 1, 1});
                    }
                    i19++;
                }
                x5Var.j(identityHashMap, i12);
                x5Var.i();
            }
            v();
            q(0, i10);
            t();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.r9
    public final void invalidate() {
        super.invalidate();
        i5 i5Var = this.v;
        if (i5Var != null) {
            i5Var.invalidate();
        }
    }

    public final void j(boolean z10) {
        int i10;
        if (this.B != null) {
            LinkedHashSet linkedHashSet = this.D;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z10) {
                Iterator it = linkedHashSet.iterator();
                i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i10 = Math.min(i10, this.B.b((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i10 = Math.max(i10, x5.o(pagetablecell) + this.B.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            x5 x5Var = this.B;
            int i11 = x5Var.b;
            if (i11 == 0 || x5Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(x5Var.c, 1);
                for (int i12 = 0; i12 < max; i12++) {
                    pagetablerow.cells.add(x5.f());
                }
                x5Var.a.rows.add(pagetablerow);
                x5Var.i();
            } else {
                int i13 = i10 < 0 ? 0 : i10;
                if (i13 <= i11) {
                    i11 = i13;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[x5Var.c];
                ArrayList arrayList = x5Var.g;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = x5Var.b(pagetablecell2);
                    int a2 = x5Var.a(pagetablecell2);
                    int o10 = x5.o(pagetablecell2);
                    int i15 = pagetablecell2.colspan;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = b10 >= i11 ? b10 + 1 : b10;
                    if (b10 < i11 && b10 + o10 > i11) {
                        o10++;
                        for (int i17 = a2; i17 < a2 + i15 && i17 < x5Var.c; i17++) {
                            zArr[i17] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i16, a2, o10, i15});
                }
                for (int i18 = 0; i18 < x5Var.c; i18++) {
                    if (!zArr[i18]) {
                        identityHashMap.put(x5.f(), new int[]{i11, i18, 1, 1});
                    }
                }
                x5Var.j(identityHashMap, x5Var.b + 1);
                x5Var.i();
            }
            v();
            q(i10, 0);
            t();
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        x5 x5Var = this.B;
        if (x5Var != null && (indexOf = x5Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final d1 l(int i10) {
        j5 m10;
        if (i10 == 0) {
            return this.r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m10 = this.v.m(h)) == null) {
            return null;
        }
        return m10.a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.B == null) {
            return null;
        }
        org.telegram.ui.i2 i2Var = this.s;
        int left = i10 - i2Var.getLeft();
        f5 f5Var = this.w;
        int left2 = left - f5Var.getLeft();
        i5 i5Var = this.v;
        int scrollX = i2Var.getScrollX() + (left2 - i5Var.getLeft());
        int top = ((i11 - i2Var.getTop()) - f5Var.getTop()) - i5Var.getTop();
        for (int i12 = 0; i12 < i5Var.getChildCount(); i12++) {
            View childAt = i5Var.getChildAt(i12);
            if (childAt instanceof j5) {
                j5 j5Var = (j5) childAt;
                if (scrollX >= j5Var.getLeft() && scrollX < j5Var.getRight() && top >= j5Var.getTop() && top < j5Var.getBottom()) {
                    return j5Var.b;
                }
            }
        }
        return null;
    }

    public final int n(int i10, int i11) {
        int i12;
        int a2;
        if (this.B == null) {
            return -1;
        }
        org.telegram.ui.i2 i2Var = this.s;
        int left = i10 - i2Var.getLeft();
        f5 f5Var = this.w;
        int left2 = left - f5Var.getLeft();
        i5 i5Var = this.v;
        int scrollX = i2Var.getScrollX() + (left2 - i5Var.getLeft());
        int top = ((i11 - i2Var.getTop()) - f5Var.getTop()) - i5Var.getTop();
        x5 x5Var = i5Var.a;
        if (x5Var == null || top < (i12 = i5Var.f[x5Var.b])) {
            return -1;
        }
        if (top >= AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
            return -1;
        }
        if (i5Var.u()) {
            int j10 = i5Var.j();
            int q6 = i5Var.q();
            if (j10 < 0) {
                return -1;
            }
            int[] iArr = i5Var.e;
            if (scrollX < iArr[j10] || scrollX >= iArr[q6 + 1]) {
                return -1;
            }
            return j10;
        }
        TL_iv.pageTableCell a3 = i5Var.a();
        if (a3 == null || (a2 = i5Var.a.a(a3)) < 0) {
            return -1;
        }
        int i13 = a3.colspan;
        int i14 = i13 != 0 ? i13 : 1;
        int[] iArr2 = i5Var.e;
        int i15 = iArr2[a2];
        int i16 = iArr2[Math.min(i14 + a2, i5Var.a.c)];
        if (scrollX < i15 || scrollX >= i16) {
            return -1;
        }
        return a2;
    }

    public final j5 o(d1 d1Var) {
        for (ViewParent parent = d1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof j5) {
                return (j5) parent;
            }
            if (parent == this) {
                return null;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.F);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.F);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = this.c;
        int d = z6.d(this.a);
        boolean z11 = this.y;
        int i17 = z11 ? d : i16;
        if (!z11) {
            i16 = d;
        }
        d1 d1Var = this.r;
        int measuredHeight = d1Var.getMeasuredHeight();
        a aVar = this.a;
        int i18 = 0;
        if (aVar != null && (i14 = aVar.l) > 0) {
            i18 = AndroidUtilities.dp(i0.a.e(i14, 1, 16, 10));
        }
        int i19 = i15 - i16;
        int i20 = measuredHeight + i18;
        d1Var.layout(AndroidUtilities.dp(16.0f) + i17, i18, i0.a.d(16.0f, i19, AndroidUtilities.dp(16.0f) + i17), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        org.telegram.ui.i2 i2Var = this.s;
        i2Var.layout(i17, dp, i19, i2Var.getMeasuredHeight() + dp);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.c) - z6.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d1 d1Var = this.r;
        d1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = d1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        org.telegram.ui.i2 i2Var = this.s;
        i2Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.a;
        int dp = (aVar != null && (i12 = aVar.l) > 0) ? AndroidUtilities.dp(i0.a.e(i12, 1, 16, 10)) : 0;
        a aVar2 = this.a;
        if (aVar2 != null && (i13 = aVar2.m) > 0) {
            i14 = AndroidUtilities.dp(i0.a.e(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, i2Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.B == null) {
            return -1;
        }
        org.telegram.ui.i2 i2Var = this.s;
        int left = i10 - i2Var.getLeft();
        f5 f5Var = this.w;
        int left2 = left - f5Var.getLeft();
        i5 i5Var = this.v;
        int scrollX = i2Var.getScrollX() + (left2 - i5Var.getLeft());
        int top = ((i11 - i2Var.getTop()) - f5Var.getTop()) - i5Var.getTop();
        if (i5Var.a == null || scrollX < (i5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) || scrollX >= i5Var.e[0]) {
            return -1;
        }
        if (i5Var.v()) {
            int k10 = i5Var.k();
            int r10 = i5Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = i5Var.f;
            if (top < iArr[k10] || top >= iArr[r10 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a2 = i5Var.a();
        if (a2 == null || (b10 = i5Var.a.b(a2)) < 0) {
            return -1;
        }
        int i12 = a2.rowspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = i5Var.f;
        int i14 = iArr2[b10];
        int i15 = iArr2[Math.min(i13 + b10, i5Var.a.b)];
        if (top < i14 || top >= i15) {
            return -1;
        }
        return b10;
    }

    public final void q(int i10, int i11) {
        int i12;
        x5 x5Var = this.B;
        if (x5Var == null || (i12 = x5Var.b) == 0 || x5Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.B.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.B.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new o2(4, this, pagetablecell));
    }

    public final boolean r() {
        x5 x5Var = this.B;
        if (x5Var == null || x5Var.g.isEmpty()) {
            return false;
        }
        j5 m10 = this.v.m((TL_iv.pageTableCell) this.B.g.get(0));
        if (m10 == null) {
            return false;
        }
        d1 d1Var = m10.a;
        d1Var.r();
        d1Var.setSelection(0);
        return true;
    }

    public final boolean s(j5 j5Var, boolean z10) {
        int indexOf;
        x5 x5Var = this.B;
        if (x5Var == null || (indexOf = x5Var.g.indexOf(j5Var.b)) < 0) {
            return false;
        }
        int i10 = z10 ? indexOf - 1 : indexOf + 1;
        if (i10 < 0 || i10 >= this.B.g.size()) {
            return false;
        }
        j5 m10 = this.v.m((TL_iv.pageTableCell) this.B.g.get(i10));
        if (m10 == null) {
            return false;
        }
        d1 d1Var = m10.a;
        d1Var.r();
        d1Var.setSelection(d1Var.length());
        return true;
    }

    public void setCellSelectionListener(d5 d5Var) {
        this.E = d5Var;
    }

    public void setLocked(boolean z10) {
        this.r.setLocked(z10);
        int i10 = 0;
        while (true) {
            i5 i5Var = this.v;
            if (i10 >= i5Var.getChildCount()) {
                return;
            }
            View childAt = i5Var.getChildAt(i10);
            if (childAt instanceof j5) {
                ((j5) childAt).setLocked(z10);
            }
            i10++;
        }
    }

    public final void t() {
        x();
        d5 d5Var = this.E;
        if (d5Var != null) {
            p3 p3Var = ((m2) d5Var).a;
            if (this != p3Var.e4) {
                return;
            }
            if (this.D.isEmpty()) {
                p3Var.M2();
            } else {
                if (p3Var.x3) {
                    return;
                }
                p3Var.F4(this);
            }
        }
    }

    public final void u() {
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = v5.f(this.r.getText());
            }
        }
    }

    public final void v() {
        i5 i5Var = this.v;
        i5Var.s();
        i5Var.requestLayout();
        i5Var.invalidate();
        y();
        w2 w2Var = this.A;
        if (w2Var == null || this.a == null) {
            return;
        }
        w2Var.a();
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        x5 x5Var = this.B;
        if (x5Var == null || pagetablecell == null) {
            return;
        }
        int b10 = x5Var.b(pagetablecell);
        int a2 = this.B.a(pagetablecell);
        int b11 = this.B.b(pagetablecell2);
        int a3 = this.B.a(pagetablecell2);
        if (b10 < 0 || a2 < 0 || b11 < 0 || a3 < 0) {
            return;
        }
        int min = Math.min(b10, b11);
        int min2 = Math.min(a2, a3);
        int i11 = this.B.b - 1;
        int i12 = pagetablecell.rowspan;
        if (i12 == 0) {
            i12 = 1;
        }
        int i13 = (b10 + i12) - 1;
        int i14 = pagetablecell2.rowspan;
        if (i14 == 0) {
            i14 = 1;
        }
        int min3 = Math.min(i11, Math.max(i13, (b11 + i14) - 1));
        int i15 = this.B.c - 1;
        int i16 = pagetablecell.colspan;
        if (i16 == 0) {
            i16 = 1;
        }
        int i17 = (a2 + i16) - 1;
        int i18 = pagetablecell2.colspan;
        if (i18 == 0) {
            i18 = 1;
        }
        int min4 = Math.min(i15, Math.max(i17, (a3 + i18) - 1));
        while (true) {
            boolean z10 = false;
            i10 = min;
            while (min <= min3) {
                int i19 = min2;
                while (min2 <= min4) {
                    x5 x5Var2 = this.B;
                    TL_iv.pageTableCell pagetablecell3 = x5Var2.d[min][min2];
                    int i20 = x5Var2.e[min][min2];
                    int i21 = x5Var2.f[min][min2];
                    int min5 = Math.min(x5Var2.b - 1, (x5.o(pagetablecell3) + i20) - 1);
                    int i22 = this.B.c - 1;
                    int i23 = pagetablecell3.colspan;
                    if (i23 == 0) {
                        i23 = 1;
                    }
                    int min6 = Math.min(i22, (i23 + i21) - 1);
                    if (i20 < i10) {
                        i10 = i20;
                        z10 = true;
                    }
                    if (i21 < i19) {
                        i19 = i21;
                        z10 = true;
                    }
                    if (min5 > min3) {
                        min3 = min5;
                        z10 = true;
                    }
                    if (min6 > min4) {
                        min4 = min6;
                        z10 = true;
                    }
                    min2++;
                }
                min++;
                min2 = i19;
            }
            if (!z10) {
                break;
            } else {
                min = i10;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (i10 <= min3) {
            for (int i24 = min2; i24 <= min4; i24++) {
                linkedHashSet.add(this.B.d[i10][i24]);
            }
            i10++;
        }
        LinkedHashSet linkedHashSet2 = this.D;
        if (linkedHashSet2.equals(linkedHashSet)) {
            return;
        }
        linkedHashSet2.clear();
        linkedHashSet2.addAll(linkedHashSet);
        this.v.invalidate();
        t();
    }

    public final void x() {
        setTranslationZ((!this.D.isEmpty() || this.v.hasFocus()) ? AndroidUtilities.dp(1.0f) : 0.0f);
        invalidate();
        this.s.invalidate();
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).invalidate();
        }
    }

    public final void y() {
        int i10 = 0;
        while (true) {
            i5 i5Var = this.v;
            if (i10 >= i5Var.getChildCount()) {
                return;
            }
            View childAt = i5Var.getChildAt(i10);
            if (childAt instanceof j5) {
                j5 j5Var = (j5) childAt;
                d1 d1Var = j5Var.a;
                d1Var.setListener(new a5(this, j5Var));
                d1Var.setDelegate(new di1(11, this, j5Var));
            }
            i10++;
        }
    }
}
