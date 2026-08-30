package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k7.b6;
import k7.i8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.x9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class i5 extends y implements a6, l9 {
    public y2 B;
    public z5 C;
    public boolean D;
    public final LinkedHashSet E;
    public f5 F;
    public final h G;
    public final f6 n;
    public final d1 r;
    public final org.telegram.ui.g2 s;
    public final k5 v;
    public final h5 w;
    public final ArrayList x;
    public boolean y;

    public i5(Context context, f6 f6Var) {
        super(context);
        this.x = new ArrayList();
        this.E = new LinkedHashSet();
        this.G = new h(this, 3);
        this.n = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        d1 d1Var = new d1(context, f6Var);
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
        d1Var.setListener(new p1(this));
        d1Var.setDelegate(new rh.e(this, 15));
        addView(d1Var);
        org.telegram.ui.g2 g2Var = new org.telegram.ui.g2(this, context, 2);
        this.s = g2Var;
        g2Var.setClipChildren(false);
        g2Var.setClipToPadding(false);
        g2Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(g2Var, b6.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        k5 k5Var = new k5(context, f6Var);
        this.v = k5Var;
        h5 h5Var = new h5(this, context);
        this.w = h5Var;
        h5Var.addView(k5Var);
        g2Var.addView(h5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.C == null) {
            return;
        }
        y2 y2Var = this.B;
        m9 textSelectionHelper = y2Var != null ? y2Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.x;
        arrayList.clear();
        fillTextLayoutBlocks(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x9 x9Var = (x9) arrayList.get(i10);
            canvas.save();
            canvas.translate(x9Var.getX(), x9Var.getY());
            textSelectionHelper.a0(canvas, this, i10);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        d1 d1Var = this.r;
        d1Var.t();
        int v02 = j6.v0(j6.G6, this.n);
        d1Var.setTextColor(v02);
        d1Var.setHintTextColor(j6.l1(0.35f, v02));
        int i10 = 0;
        while (true) {
            k5 k5Var = this.v;
            if (i10 >= k5Var.getChildCount()) {
                k5Var.b();
                return;
            }
            View childAt = k5Var.getChildAt(i10);
            if (childAt instanceof l5) {
                ((l5) childAt).a.t();
            }
            i10++;
        }
    }

    @Override // vh.y
    public final void f(int i10) {
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.l9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d1 d1Var;
        Layout layout;
        if (this.C == null) {
            return;
        }
        d1 d1Var2 = this.r;
        Layout layout2 = d1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new d5(this, layout2, d1Var2.getPaddingLeft() + d1Var2.getLeft(), d1Var2.getPaddingTop() + d1Var2.getTop()));
        }
        int size = this.C.g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.C.g.get(i10);
            k5 k5Var = this.v;
            l5 m9 = k5Var.m(pagetablecell);
            if (m9 != null && (layout = (d1Var = m9.a).getLayout()) != null) {
                org.telegram.ui.g2 g2Var = this.s;
                int left = g2Var.getLeft();
                h5 h5Var = this.w;
                arrayList.add(new e5(layout, d1Var.getPaddingLeft() + d1Var.getLeft() + m9.getLeft() + ((k5Var.getLeft() + (h5Var.getLeft() + left)) - g2Var.getScrollX()), d1Var.getPaddingTop() + d1Var.getTop() + m9.getTop() + k5Var.getTop() + h5Var.getTop() + g2Var.getTop(), this.C.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public k5 getGrid() {
        return this.v;
    }

    public z5 getModel() {
        return this.C;
    }

    public a getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.E;
    }

    public d1 getTitleEditText() {
        return this.r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        z5 z5Var = this.C;
        if (z5Var == null || i10 <= 0 || i10 - 1 >= z5Var.g.size()) {
            return null;
        }
        return (TL_iv.pageTableCell) this.C.g.get(i11);
    }

    public final void i(boolean z4) {
        int i10;
        int i11;
        int i12;
        if (this.C != null) {
            LinkedHashSet linkedHashSet = this.E;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z4) {
                Iterator it = linkedHashSet.iterator();
                i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i10 = Math.min(i10, this.C.a((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i10 = Math.max(i10, z5.n(pagetablecell) + this.C.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            z5 z5Var = this.C;
            if (z5Var.b == 0 || (i11 = z5Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = z5Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(z5.f());
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
                        pagetablerow3.cells.add(z5.f());
                    }
                }
                z5Var.i();
            } else {
                int i14 = i10 < 0 ? 0 : i10;
                if (i14 <= i11) {
                    i11 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[z5Var.b];
                ArrayList arrayList3 = z5Var.g;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = z5Var.b(pagetablecell2);
                    int a2 = z5Var.a(pagetablecell2);
                    int o10 = z5.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = a2 >= i11 ? a2 + 1 : a2;
                    if (a2 < i11 && a2 + i16 > i11) {
                        i16++;
                        for (int i18 = b10; i18 < b10 + o10 && i18 < z5Var.b; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i17, o10, i16});
                }
                int i19 = 0;
                while (true) {
                    i12 = z5Var.b;
                    if (i19 >= i12) {
                        break;
                    }
                    if (!zArr[i19]) {
                        identityHashMap.put(z5.f(), new int[]{i19, i11, 1, 1});
                    }
                    i19++;
                }
                z5Var.j(identityHashMap, i12);
                z5Var.i();
            }
            v();
            q(0, i10);
            t();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.u9
    public final void invalidate() {
        super.invalidate();
        k5 k5Var = this.v;
        if (k5Var != null) {
            k5Var.invalidate();
        }
    }

    public final void j(boolean z4) {
        int i10;
        if (this.C != null) {
            LinkedHashSet linkedHashSet = this.E;
            if (linkedHashSet.isEmpty()) {
                return;
            }
            if (z4) {
                Iterator it = linkedHashSet.iterator();
                i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                while (it.hasNext()) {
                    i10 = Math.min(i10, this.C.b((TL_iv.pageTableCell) it.next()));
                }
            } else {
                Iterator it2 = linkedHashSet.iterator();
                i10 = 0;
                while (it2.hasNext()) {
                    TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it2.next();
                    i10 = Math.max(i10, z5.o(pagetablecell) + this.C.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            z5 z5Var = this.C;
            int i11 = z5Var.b;
            if (i11 == 0 || z5Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(z5Var.c, 1);
                for (int i12 = 0; i12 < max; i12++) {
                    pagetablerow.cells.add(z5.f());
                }
                z5Var.a.rows.add(pagetablerow);
                z5Var.i();
            } else {
                int i13 = i10 < 0 ? 0 : i10;
                if (i13 <= i11) {
                    i11 = i13;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[z5Var.c];
                ArrayList arrayList = z5Var.g;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = z5Var.b(pagetablecell2);
                    int a2 = z5Var.a(pagetablecell2);
                    int o10 = z5.o(pagetablecell2);
                    int i15 = pagetablecell2.colspan;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = b10 >= i11 ? b10 + 1 : b10;
                    if (b10 < i11 && b10 + o10 > i11) {
                        o10++;
                        for (int i17 = a2; i17 < a2 + i15 && i17 < z5Var.c; i17++) {
                            zArr[i17] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i16, a2, o10, i15});
                }
                for (int i18 = 0; i18 < z5Var.c; i18++) {
                    if (!zArr[i18]) {
                        identityHashMap.put(z5.f(), new int[]{i11, i18, 1, 1});
                    }
                }
                z5Var.j(identityHashMap, z5Var.b + 1);
                z5Var.i();
            }
            v();
            q(i10, 0);
            t();
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        z5 z5Var = this.C;
        if (z5Var != null && (indexOf = z5Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final d1 l(int i10) {
        l5 m9;
        if (i10 == 0) {
            return this.r;
        }
        TL_iv.pageTableCell h = h(i10);
        if (h == null || (m9 = this.v.m(h)) == null) {
            return null;
        }
        return m9.a;
    }

    public final TL_iv.pageTableCell m(int i10, int i11) {
        if (this.C == null) {
            return null;
        }
        org.telegram.ui.g2 g2Var = this.s;
        int left = i10 - g2Var.getLeft();
        h5 h5Var = this.w;
        int left2 = left - h5Var.getLeft();
        k5 k5Var = this.v;
        int scrollX = g2Var.getScrollX() + (left2 - k5Var.getLeft());
        int top = ((i11 - g2Var.getTop()) - h5Var.getTop()) - k5Var.getTop();
        for (int i12 = 0; i12 < k5Var.getChildCount(); i12++) {
            View childAt = k5Var.getChildAt(i12);
            if (childAt instanceof l5) {
                l5 l5Var = (l5) childAt;
                if (scrollX >= l5Var.getLeft() && scrollX < l5Var.getRight() && top >= l5Var.getTop() && top < l5Var.getBottom()) {
                    return l5Var.b;
                }
            }
        }
        return null;
    }

    public final int n(int i10, int i11) {
        int i12;
        int a2;
        if (this.C == null) {
            return -1;
        }
        org.telegram.ui.g2 g2Var = this.s;
        int left = i10 - g2Var.getLeft();
        h5 h5Var = this.w;
        int left2 = left - h5Var.getLeft();
        k5 k5Var = this.v;
        int scrollX = g2Var.getScrollX() + (left2 - k5Var.getLeft());
        int top = ((i11 - g2Var.getTop()) - h5Var.getTop()) - k5Var.getTop();
        z5 z5Var = k5Var.a;
        if (z5Var == null || top < (i12 = k5Var.f[z5Var.b])) {
            return -1;
        }
        if (top >= AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
            return -1;
        }
        if (k5Var.u()) {
            int j10 = k5Var.j();
            int q10 = k5Var.q();
            if (j10 < 0) {
                return -1;
            }
            int[] iArr = k5Var.e;
            if (scrollX < iArr[j10] || scrollX >= iArr[q10 + 1]) {
                return -1;
            }
            return j10;
        }
        TL_iv.pageTableCell a10 = k5Var.a();
        if (a10 == null || (a2 = k5Var.a.a(a10)) < 0) {
            return -1;
        }
        int i13 = a10.colspan;
        int i14 = i13 != 0 ? i13 : 1;
        int[] iArr2 = k5Var.e;
        int i15 = iArr2[a2];
        int i16 = iArr2[Math.min(i14 + a2, k5Var.a.c)];
        if (scrollX < i15 || scrollX >= i16) {
            return -1;
        }
        return a2;
    }

    public final l5 o(d1 d1Var) {
        for (ViewParent parent = d1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof l5) {
                return (l5) parent;
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
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.G);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.G);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15 = i12 - i10;
        int i16 = this.c;
        int d = i8.d(this.a);
        boolean z10 = this.y;
        int i17 = z10 ? d : i16;
        if (!z10) {
            i16 = d;
        }
        d1 d1Var = this.r;
        int measuredHeight = d1Var.getMeasuredHeight();
        a aVar = this.a;
        int i18 = 0;
        if (aVar != null && (i14 = aVar.l) > 0) {
            i18 = AndroidUtilities.dp(e2.c.e(i14, 1, 16, 10));
        }
        int i19 = i15 - i16;
        int i20 = measuredHeight + i18;
        d1Var.layout(AndroidUtilities.dp(16.0f) + i17, i18, kh.a2.c(16.0f, i19, AndroidUtilities.dp(16.0f) + i17), i20);
        int dp = AndroidUtilities.dp(9.0f) + i20;
        org.telegram.ui.g2 g2Var = this.s;
        g2Var.layout(i17, dp, i19, g2Var.getMeasuredHeight() + dp);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = 0;
        int max = Math.max(0, (size - this.c) - i8.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        d1 d1Var = this.r;
        d1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = d1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        org.telegram.ui.g2 g2Var = this.s;
        g2Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.a;
        int dp = (aVar != null && (i12 = aVar.l) > 0) ? AndroidUtilities.dp(e2.c.e(i12, 1, 16, 10)) : 0;
        a aVar2 = this.a;
        if (aVar2 != null && (i13 = aVar2.m) > 0) {
            i14 = AndroidUtilities.dp(e2.c.e(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, g2Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.C == null) {
            return -1;
        }
        org.telegram.ui.g2 g2Var = this.s;
        int left = i10 - g2Var.getLeft();
        h5 h5Var = this.w;
        int left2 = left - h5Var.getLeft();
        k5 k5Var = this.v;
        int scrollX = g2Var.getScrollX() + (left2 - k5Var.getLeft());
        int top = ((i11 - g2Var.getTop()) - h5Var.getTop()) - k5Var.getTop();
        if (k5Var.a == null || scrollX < (k5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) || scrollX >= k5Var.e[0]) {
            return -1;
        }
        if (k5Var.v()) {
            int k10 = k5Var.k();
            int r10 = k5Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = k5Var.f;
            if (top < iArr[k10] || top >= iArr[r10 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a2 = k5Var.a();
        if (a2 == null || (b10 = k5Var.a.b(a2)) < 0) {
            return -1;
        }
        int i12 = a2.rowspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = k5Var.f;
        int i14 = iArr2[b10];
        int i15 = iArr2[Math.min(i13 + b10, k5Var.a.b)];
        if (top < i14 || top >= i15) {
            return -1;
        }
        return b10;
    }

    public final void q(int i10, int i11) {
        int i12;
        z5 z5Var = this.C;
        if (z5Var == null || (i12 = z5Var.b) == 0 || z5Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.C.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.C.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new uf.v0(12, this, pagetablecell));
    }

    public final boolean r() {
        z5 z5Var = this.C;
        if (z5Var == null || z5Var.g.isEmpty()) {
            return false;
        }
        l5 m9 = this.v.m((TL_iv.pageTableCell) this.C.g.get(0));
        if (m9 == null) {
            return false;
        }
        d1 d1Var = m9.a;
        d1Var.r();
        d1Var.setSelection(0);
        return true;
    }

    public final boolean s(l5 l5Var, boolean z4) {
        int indexOf;
        z5 z5Var = this.C;
        if (z5Var == null || (indexOf = z5Var.g.indexOf(l5Var.b)) < 0) {
            return false;
        }
        int i10 = z4 ? indexOf - 1 : indexOf + 1;
        if (i10 < 0 || i10 >= this.C.g.size()) {
            return false;
        }
        l5 m9 = this.v.m((TL_iv.pageTableCell) this.C.g.get(i10));
        if (m9 == null) {
            return false;
        }
        d1 d1Var = m9.a;
        d1Var.r();
        d1Var.setSelection(d1Var.length());
        return true;
    }

    public void setCellSelectionListener(f5 f5Var) {
        this.F = f5Var;
    }

    public void setLocked(boolean z4) {
        this.r.setLocked(z4);
        int i10 = 0;
        while (true) {
            k5 k5Var = this.v;
            if (i10 >= k5Var.getChildCount()) {
                return;
            }
            View childAt = k5Var.getChildAt(i10);
            if (childAt instanceof l5) {
                ((l5) childAt).setLocked(z4);
            }
            i10++;
        }
    }

    public final void t() {
        x();
        f5 f5Var = this.F;
        if (f5Var != null) {
            r3 r3Var = ((n2) f5Var).a;
            if (this != r3Var.f4) {
                return;
            }
            if (this.E.isEmpty()) {
                r3Var.M2();
            } else {
                if (r3Var.y3) {
                    return;
                }
                r3Var.F4(this);
            }
        }
    }

    public final void u() {
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = x5.f(this.r.getText());
            }
        }
    }

    public final void v() {
        k5 k5Var = this.v;
        k5Var.s();
        k5Var.requestLayout();
        k5Var.invalidate();
        y();
        y2 y2Var = this.B;
        if (y2Var == null || this.a == null) {
            return;
        }
        y2Var.a();
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        z5 z5Var = this.C;
        if (z5Var == null || pagetablecell == null) {
            return;
        }
        int b10 = z5Var.b(pagetablecell);
        int a2 = this.C.a(pagetablecell);
        int b11 = this.C.b(pagetablecell2);
        int a10 = this.C.a(pagetablecell2);
        if (b10 < 0 || a2 < 0 || b11 < 0 || a10 < 0) {
            return;
        }
        int min = Math.min(b10, b11);
        int min2 = Math.min(a2, a10);
        int i11 = this.C.b - 1;
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
        int i15 = this.C.c - 1;
        int i16 = pagetablecell.colspan;
        if (i16 == 0) {
            i16 = 1;
        }
        int i17 = (a2 + i16) - 1;
        int i18 = pagetablecell2.colspan;
        if (i18 == 0) {
            i18 = 1;
        }
        int min4 = Math.min(i15, Math.max(i17, (a10 + i18) - 1));
        while (true) {
            boolean z4 = false;
            i10 = min;
            while (min <= min3) {
                int i19 = min2;
                while (min2 <= min4) {
                    z5 z5Var2 = this.C;
                    TL_iv.pageTableCell pagetablecell3 = z5Var2.d[min][min2];
                    int i20 = z5Var2.e[min][min2];
                    int i21 = z5Var2.f[min][min2];
                    int min5 = Math.min(z5Var2.b - 1, (z5.o(pagetablecell3) + i20) - 1);
                    int i22 = this.C.c - 1;
                    int i23 = pagetablecell3.colspan;
                    if (i23 == 0) {
                        i23 = 1;
                    }
                    int min6 = Math.min(i22, (i23 + i21) - 1);
                    if (i20 < i10) {
                        i10 = i20;
                        z4 = true;
                    }
                    if (i21 < i19) {
                        i19 = i21;
                        z4 = true;
                    }
                    if (min5 > min3) {
                        min3 = min5;
                        z4 = true;
                    }
                    if (min6 > min4) {
                        min4 = min6;
                        z4 = true;
                    }
                    min2++;
                }
                min++;
                min2 = i19;
            }
            if (!z4) {
                break;
            } else {
                min = i10;
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (i10 <= min3) {
            for (int i24 = min2; i24 <= min4; i24++) {
                linkedHashSet.add(this.C.d[i10][i24]);
            }
            i10++;
        }
        LinkedHashSet linkedHashSet2 = this.E;
        if (linkedHashSet2.equals(linkedHashSet)) {
            return;
        }
        linkedHashSet2.clear();
        linkedHashSet2.addAll(linkedHashSet);
        this.v.invalidate();
        t();
    }

    public final void x() {
        setTranslationZ((!this.E.isEmpty() || this.v.hasFocus()) ? AndroidUtilities.dp(1.0f) : 0.0f);
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
            k5 k5Var = this.v;
            if (i10 >= k5Var.getChildCount()) {
                return;
            }
            View childAt = k5Var.getChildAt(i10);
            if (childAt instanceof l5) {
                l5 l5Var = (l5) childAt;
                d1 d1Var = l5Var.a;
                d1Var.setListener(new c5(this, l5Var));
                d1Var.setDelegate(new org.telegram.ui.web.m(14, this, l5Var));
            }
            i10++;
        }
    }
}
