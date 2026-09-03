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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.tp0;
import ph.z8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class j5 extends z implements org.telegram.ui.ActionBar.a6, k9 {
    public z2 B;
    public a6 C;
    public boolean D;
    public final LinkedHashSet E;
    public g5 F;
    public final i G;
    public final f6 n;
    public final e1 r;
    public final org.telegram.ui.i2 s;
    public final l5 v;
    public final i5 w;
    public final ArrayList x;
    public boolean y;

    public j5(Context context, f6 f6Var) {
        super(context);
        this.x = new ArrayList();
        this.E = new LinkedHashSet();
        this.G = new i(this, 3);
        this.n = f6Var;
        setClipChildren(false);
        setClipToPadding(false);
        e1 e1Var = new e1(context, f6Var);
        this.r = e1Var;
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(49);
        e1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        e1Var.setIncludeFontPadding(false);
        e1Var.setMinHeight(0);
        e1Var.setBackground(null);
        e1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), 0);
        e1Var.setHint(LocaleController.getString(R.string.ArticleTableTitleHint));
        e1Var.setCenterEmptyHint(true);
        e1Var.setListener(new tp0(this, 22));
        e1Var.setDelegate(new z8(this, 18));
        addView(e1Var);
        org.telegram.ui.i2 i2Var = new org.telegram.ui.i2(this, context, 2);
        this.s = i2Var;
        i2Var.setClipChildren(false);
        i2Var.setClipToPadding(false);
        i2Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(i2Var, b6.d(-1, -2.0f, 51, 0.0f, 6.0f, 0.0f, 0.0f));
        l5 l5Var = new l5(context, f6Var);
        this.v = l5Var;
        i5 i5Var = new i5(this, context);
        this.w = i5Var;
        i5Var.addView(l5Var);
        i2Var.addView(i5Var, new FrameLayout.LayoutParams(-2, -2));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.C == null) {
            return;
        }
        z2 z2Var = this.B;
        l9 textSelectionHelper = z2Var != null ? z2Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper == null) {
            return;
        }
        ArrayList arrayList = this.x;
        arrayList.clear();
        fillTextLayoutBlocks(arrayList);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w9 w9Var = (w9) arrayList.get(i10);
            canvas.save();
            canvas.translate(w9Var.getX(), w9Var.getY());
            textSelectionHelper.a0(canvas, this, i10);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        e1 e1Var = this.r;
        e1Var.t();
        int v02 = j6.v0(j6.G6, this.n);
        e1Var.setTextColor(v02);
        e1Var.setHintTextColor(j6.l1(0.35f, v02));
        int i10 = 0;
        while (true) {
            l5 l5Var = this.v;
            if (i10 >= l5Var.getChildCount()) {
                l5Var.b();
                return;
            }
            View childAt = l5Var.getChildAt(i10);
            if (childAt instanceof m5) {
                ((m5) childAt).a.t();
            }
            i10++;
        }
    }

    @Override // vh.z
    public final void f(int i10) {
        requestLayout();
    }

    @Override // org.telegram.ui.Cells.k9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e1 e1Var;
        Layout layout;
        if (this.C == null) {
            return;
        }
        e1 e1Var2 = this.r;
        Layout layout2 = e1Var2.getLayout();
        if (layout2 != null) {
            arrayList.add(new e5(this, layout2, e1Var2.getPaddingLeft() + e1Var2.getLeft(), e1Var2.getPaddingTop() + e1Var2.getTop()));
        }
        int size = this.C.g.size();
        for (int i10 = 0; i10 < size; i10++) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.C.g.get(i10);
            l5 l5Var = this.v;
            m5 m9 = l5Var.m(pagetablecell);
            if (m9 != null && (layout = (e1Var = m9.a).getLayout()) != null) {
                org.telegram.ui.i2 i2Var = this.s;
                int left = i2Var.getLeft();
                i5 i5Var = this.w;
                arrayList.add(new f5(layout, e1Var.getPaddingLeft() + e1Var.getLeft() + m9.getLeft() + ((l5Var.getLeft() + (i5Var.getLeft() + left)) - i2Var.getScrollX()), e1Var.getPaddingTop() + e1Var.getTop() + m9.getTop() + l5Var.getTop() + i5Var.getTop() + i2Var.getTop(), this.C.b(pagetablecell) + 10, pagetablecell));
            }
        }
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public l5 getGrid() {
        return this.v;
    }

    public a6 getModel() {
        return this.C;
    }

    public a getRow() {
        return this.a;
    }

    public Set<TL_iv.pageTableCell> getSelectedCells() {
        return this.E;
    }

    public e1 getTitleEditText() {
        return this.r;
    }

    public final TL_iv.pageTableCell h(int i10) {
        int i11;
        a6 a6Var = this.C;
        if (a6Var == null || i10 <= 0 || i10 - 1 >= a6Var.g.size()) {
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
                    i10 = Math.max(i10, a6.n(pagetablecell) + this.C.a(pagetablecell));
                }
            }
            linkedHashSet.clear();
            a6 a6Var = this.C;
            if (a6Var.b == 0 || (i11 = a6Var.c) == 0) {
                TL_iv.pageBlockTable pageblocktable = a6Var.a;
                if (pageblocktable.rows.isEmpty()) {
                    TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                    ArrayList<TL_iv.pageTableCell> arrayList = new ArrayList<>();
                    pagetablerow.cells = arrayList;
                    arrayList.add(a6.f());
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
                        pagetablerow3.cells.add(a6.f());
                    }
                }
                a6Var.i();
            } else {
                int i14 = i10 < 0 ? 0 : i10;
                if (i14 <= i11) {
                    i11 = i14;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[a6Var.b];
                ArrayList arrayList3 = a6Var.g;
                int size2 = arrayList3.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = a6Var.b(pagetablecell2);
                    int a2 = a6Var.a(pagetablecell2);
                    int o10 = a6.o(pagetablecell2);
                    int i16 = pagetablecell2.colspan;
                    if (i16 == 0) {
                        i16 = 1;
                    }
                    int i17 = a2 >= i11 ? a2 + 1 : a2;
                    if (a2 < i11 && a2 + i16 > i11) {
                        i16++;
                        for (int i18 = b10; i18 < b10 + o10 && i18 < a6Var.b; i18++) {
                            zArr[i18] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{b10, i17, o10, i16});
                }
                int i19 = 0;
                while (true) {
                    i12 = a6Var.b;
                    if (i19 >= i12) {
                        break;
                    }
                    if (!zArr[i19]) {
                        identityHashMap.put(a6.f(), new int[]{i19, i11, 1, 1});
                    }
                    i19++;
                }
                a6Var.j(identityHashMap, i12);
                a6Var.i();
            }
            v();
            q(0, i10);
            t();
        }
    }

    @Override // android.view.View, org.telegram.ui.Cells.t9
    public final void invalidate() {
        super.invalidate();
        l5 l5Var = this.v;
        if (l5Var != null) {
            l5Var.invalidate();
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
                    i10 = Math.max(i10, a6.o(pagetablecell) + this.C.b(pagetablecell));
                }
            }
            linkedHashSet.clear();
            a6 a6Var = this.C;
            int i11 = a6Var.b;
            if (i11 == 0 || a6Var.c == 0) {
                TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
                pagetablerow.cells = new ArrayList<>();
                int max = Math.max(a6Var.c, 1);
                for (int i12 = 0; i12 < max; i12++) {
                    pagetablerow.cells.add(a6.f());
                }
                a6Var.a.rows.add(pagetablerow);
                a6Var.i();
            } else {
                int i13 = i10 < 0 ? 0 : i10;
                if (i13 <= i11) {
                    i11 = i13;
                }
                IdentityHashMap identityHashMap = new IdentityHashMap();
                boolean[] zArr = new boolean[a6Var.c];
                ArrayList arrayList = a6Var.g;
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj;
                    int b10 = a6Var.b(pagetablecell2);
                    int a2 = a6Var.a(pagetablecell2);
                    int o10 = a6.o(pagetablecell2);
                    int i15 = pagetablecell2.colspan;
                    if (i15 == 0) {
                        i15 = 1;
                    }
                    int i16 = b10 >= i11 ? b10 + 1 : b10;
                    if (b10 < i11 && b10 + o10 > i11) {
                        o10++;
                        for (int i17 = a2; i17 < a2 + i15 && i17 < a6Var.c; i17++) {
                            zArr[i17] = true;
                        }
                    }
                    identityHashMap.put(pagetablecell2, new int[]{i16, a2, o10, i15});
                }
                for (int i18 = 0; i18 < a6Var.c; i18++) {
                    if (!zArr[i18]) {
                        identityHashMap.put(a6.f(), new int[]{i11, i18, 1, 1});
                    }
                }
                a6Var.j(identityHashMap, a6Var.b + 1);
                a6Var.i();
            }
            v();
            q(i10, 0);
            t();
        }
    }

    public final int k(TL_iv.pageTableCell pagetablecell) {
        int indexOf;
        a6 a6Var = this.C;
        if (a6Var != null && (indexOf = a6Var.g.indexOf(pagetablecell)) >= 0) {
            return indexOf + 1;
        }
        return -1;
    }

    public final e1 l(int i10) {
        m5 m9;
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
        org.telegram.ui.i2 i2Var = this.s;
        int left = i10 - i2Var.getLeft();
        i5 i5Var = this.w;
        int left2 = left - i5Var.getLeft();
        l5 l5Var = this.v;
        int scrollX = i2Var.getScrollX() + (left2 - l5Var.getLeft());
        int top = ((i11 - i2Var.getTop()) - i5Var.getTop()) - l5Var.getTop();
        for (int i12 = 0; i12 < l5Var.getChildCount(); i12++) {
            View childAt = l5Var.getChildAt(i12);
            if (childAt instanceof m5) {
                m5 m5Var = (m5) childAt;
                if (scrollX >= m5Var.getLeft() && scrollX < m5Var.getRight() && top >= m5Var.getTop() && top < m5Var.getBottom()) {
                    return m5Var.b;
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
        org.telegram.ui.i2 i2Var = this.s;
        int left = i10 - i2Var.getLeft();
        i5 i5Var = this.w;
        int left2 = left - i5Var.getLeft();
        l5 l5Var = this.v;
        int scrollX = i2Var.getScrollX() + (left2 - l5Var.getLeft());
        int top = ((i11 - i2Var.getTop()) - i5Var.getTop()) - l5Var.getTop();
        a6 a6Var = l5Var.a;
        if (a6Var == null || top < (i12 = l5Var.f[a6Var.b])) {
            return -1;
        }
        if (top >= AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(16.0f) + i12) {
            return -1;
        }
        if (l5Var.u()) {
            int j10 = l5Var.j();
            int q10 = l5Var.q();
            if (j10 < 0) {
                return -1;
            }
            int[] iArr = l5Var.e;
            if (scrollX < iArr[j10] || scrollX >= iArr[q10 + 1]) {
                return -1;
            }
            return j10;
        }
        TL_iv.pageTableCell a10 = l5Var.a();
        if (a10 == null || (a2 = l5Var.a.a(a10)) < 0) {
            return -1;
        }
        int i13 = a10.colspan;
        int i14 = i13 != 0 ? i13 : 1;
        int[] iArr2 = l5Var.e;
        int i15 = iArr2[a2];
        int i16 = iArr2[Math.min(i14 + a2, l5Var.a.c)];
        if (scrollX < i15 || scrollX >= i16) {
            return -1;
        }
        return a2;
    }

    public final m5 o(e1 e1Var) {
        for (ViewParent parent = e1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof m5) {
                return (m5) parent;
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
        e1 e1Var = this.r;
        int measuredHeight = e1Var.getMeasuredHeight();
        a aVar = this.a;
        int i18 = 0;
        if (aVar != null && (i14 = aVar.l) > 0) {
            i18 = AndroidUtilities.dp(e2.c.e(i14, 1, 16, 10));
        }
        int i19 = i15 - i16;
        int i20 = measuredHeight + i18;
        e1Var.layout(AndroidUtilities.dp(16.0f) + i17, i18, kf.k0.c(16.0f, i19, AndroidUtilities.dp(16.0f) + i17), i20);
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
        int max = Math.max(0, (size - this.c) - i8.d(this.a));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, max - (AndroidUtilities.dp(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        e1 e1Var = this.r;
        e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = e1Var.getMeasuredHeight();
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        org.telegram.ui.i2 i2Var = this.s;
        i2Var.measure(makeMeasureSpec3, makeMeasureSpec4);
        a aVar = this.a;
        int dp = (aVar != null && (i12 = aVar.l) > 0) ? AndroidUtilities.dp(e2.c.e(i12, 1, 16, 10)) : 0;
        a aVar2 = this.a;
        if (aVar2 != null && (i13 = aVar2.m) > 0) {
            i14 = AndroidUtilities.dp(e2.c.e(i13, 1, 16, 10));
        }
        setMeasuredDimension(size, i2Var.getMeasuredHeight() + AndroidUtilities.dp(9.0f) + i14 + dp + measuredHeight);
    }

    public final int p(int i10, int i11) {
        int b10;
        if (this.C == null) {
            return -1;
        }
        org.telegram.ui.i2 i2Var = this.s;
        int left = i10 - i2Var.getLeft();
        i5 i5Var = this.w;
        int left2 = left - i5Var.getLeft();
        l5 l5Var = this.v;
        int scrollX = i2Var.getScrollX() + (left2 - l5Var.getLeft());
        int top = ((i11 - i2Var.getTop()) - i5Var.getTop()) - l5Var.getTop();
        if (l5Var.a == null || scrollX < (l5Var.e[0] - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f) || scrollX >= l5Var.e[0]) {
            return -1;
        }
        if (l5Var.v()) {
            int k10 = l5Var.k();
            int r10 = l5Var.r();
            if (k10 < 0) {
                return -1;
            }
            int[] iArr = l5Var.f;
            if (top < iArr[k10] || top >= iArr[r10 + 1]) {
                return -1;
            }
            return k10;
        }
        TL_iv.pageTableCell a2 = l5Var.a();
        if (a2 == null || (b10 = l5Var.a.b(a2)) < 0) {
            return -1;
        }
        int i12 = a2.rowspan;
        int i13 = i12 != 0 ? i12 : 1;
        int[] iArr2 = l5Var.f;
        int i14 = iArr2[b10];
        int i15 = iArr2[Math.min(i13 + b10, l5Var.a.b)];
        if (top < i14 || top >= i15) {
            return -1;
        }
        return b10;
    }

    public final void q(int i10, int i11) {
        int i12;
        a6 a6Var = this.C;
        if (a6Var == null || (i12 = a6Var.b) == 0 || a6Var.c == 0) {
            return;
        }
        TL_iv.pageTableCell pagetablecell = this.C.d[Math.max(0, Math.min(i10, i12 - 1))][Math.max(0, Math.min(i11, this.C.c - 1))];
        if (pagetablecell == null) {
            return;
        }
        post(new uf.d0(14, this, pagetablecell));
    }

    public final boolean r() {
        a6 a6Var = this.C;
        if (a6Var == null || a6Var.g.isEmpty()) {
            return false;
        }
        m5 m9 = this.v.m((TL_iv.pageTableCell) this.C.g.get(0));
        if (m9 == null) {
            return false;
        }
        e1 e1Var = m9.a;
        e1Var.r();
        e1Var.setSelection(0);
        return true;
    }

    public final boolean s(m5 m5Var, boolean z4) {
        int indexOf;
        a6 a6Var = this.C;
        if (a6Var == null || (indexOf = a6Var.g.indexOf(m5Var.b)) < 0) {
            return false;
        }
        int i10 = z4 ? indexOf - 1 : indexOf + 1;
        if (i10 < 0 || i10 >= this.C.g.size()) {
            return false;
        }
        m5 m9 = this.v.m((TL_iv.pageTableCell) this.C.g.get(i10));
        if (m9 == null) {
            return false;
        }
        e1 e1Var = m9.a;
        e1Var.r();
        e1Var.setSelection(e1Var.length());
        return true;
    }

    public void setCellSelectionListener(g5 g5Var) {
        this.F = g5Var;
    }

    public void setLocked(boolean z4) {
        this.r.setLocked(z4);
        int i10 = 0;
        while (true) {
            l5 l5Var = this.v;
            if (i10 >= l5Var.getChildCount()) {
                return;
            }
            View childAt = l5Var.getChildAt(i10);
            if (childAt instanceof m5) {
                ((m5) childAt).setLocked(z4);
            }
            i10++;
        }
    }

    public final void t() {
        x();
        g5 g5Var = this.F;
        if (g5Var != null) {
            s3 s3Var = ((o2) g5Var).a;
            if (this != s3Var.f4) {
                return;
            }
            if (this.E.isEmpty()) {
                s3Var.L2();
            } else {
                if (s3Var.y3) {
                    return;
                }
                s3Var.E4(this);
            }
        }
    }

    public final void u() {
        a aVar = this.a;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if (pageBlock instanceof TL_iv.pageBlockTable) {
                ((TL_iv.pageBlockTable) pageBlock).title = y5.f(this.r.getText());
            }
        }
    }

    public final void v() {
        l5 l5Var = this.v;
        l5Var.s();
        l5Var.requestLayout();
        l5Var.invalidate();
        y();
        z2 z2Var = this.B;
        if (z2Var == null || this.a == null) {
            return;
        }
        z2Var.a();
    }

    public final void w(TL_iv.pageTableCell pagetablecell, TL_iv.pageTableCell pagetablecell2) {
        int i10;
        a6 a6Var = this.C;
        if (a6Var == null || pagetablecell == null) {
            return;
        }
        int b10 = a6Var.b(pagetablecell);
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
                    a6 a6Var2 = this.C;
                    TL_iv.pageTableCell pagetablecell3 = a6Var2.d[min][min2];
                    int i20 = a6Var2.e[min][min2];
                    int i21 = a6Var2.f[min][min2];
                    int min5 = Math.min(a6Var2.b - 1, (a6.o(pagetablecell3) + i20) - 1);
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
            l5 l5Var = this.v;
            if (i10 >= l5Var.getChildCount()) {
                return;
            }
            View childAt = l5Var.getChildAt(i10);
            if (childAt instanceof m5) {
                m5 m5Var = (m5) childAt;
                e1 e1Var = m5Var.a;
                e1Var.setListener(new d5(this, m5Var));
                e1Var.setDelegate(new org.telegram.ui.web.m(14, this, m5Var));
            }
            i10++;
        }
    }
}
