package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class t7 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.ya0 {
    public boolean D;
    public final e7 E;
    public i7 F;
    public final org.telegram.ui.ActionBar.y1 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final org.telegram.ui.Components.u61 d;
    public final y6 e;
    public final ArrayList f;
    public ci.c h;
    public final org.telegram.ui.Components.v61 n;
    public final r7[] r;
    public h7 s;
    public int w;
    public final org.telegram.ui.Components.it0 x;
    public int y;

    public t7(Context context, y6 y6Var, oi.q qVar, org.telegram.ui.Components.it0 it0Var) {
        super(context);
        this.b = new ArrayList();
        this.f = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.r = r7VarArr;
        this.E = new e7(this, 0);
        this.e = y6Var;
        this.x = it0Var;
        if (it0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        r7VarArr[0] = new r7(org.telegram.messenger.id.M0(2131750796, null), 0, new j7(this));
        final int i7 = 1;
        r7VarArr[1] = new r7(org.telegram.messenger.id.M0(2131748651, null), 1, new o7(this));
        r7VarArr[2] = new r7(org.telegram.messenger.id.M0(2131745414, null), 2, new l7(this));
        r7VarArr[3] = new r7(org.telegram.messenger.id.M0(2131748319, null), 3, new q7(this));
        int i10 = 0;
        while (true) {
            r7[] r7VarArr2 = this.r;
            if (i10 >= r7VarArr2.length) {
                break;
            }
            r7 r7Var = r7VarArr2[i10];
            if (r7Var != null) {
                this.f.add(i10, r7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.v61 v61Var = it0Var == null ? new org.telegram.ui.Components.v61(getContext(), null) : new org.telegram.ui.Components.rj0(context, y6Var.getResourceProvider(), it0Var);
        this.n = v61Var;
        v61Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(v61Var);
        }
        addView(v61Var, c8.ha.d(-1, -1.0f, 48, 0.0f, (qVar == null && it0Var == null) ? 48.0f : 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.u61 n10 = v61Var.n(qVar != null ? -2 : 3, true);
        this.d = n10;
        frameLayout.addView(n10, c8.ha.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, c8.ha.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        v61Var.setAdapter(new d7(this, context, qVar, y6Var, it0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, c8.ha.c(48.0f, -1));
        org.telegram.messenger.g0.Z3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(true);
        this.a = y1Var;
        imageView.setImageDrawable(y1Var);
        int i11 = org.telegram.ui.ActionBar.m6.y8;
        y1Var.a(org.telegram.ui.ActionBar.m6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.m6.z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131752041, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.b.add(imageView);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z6
            public final /* synthetic */ t7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.F.d();
                        break;
                    default:
                        this.b.F.clear();
                        break;
                }
            }
        });
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, true, true);
        i6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(i6Var, i11, null);
        linearLayout.addView(i6Var, c8.ha.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(i6Var);
        org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(context, null, org.telegram.ui.ActionBar.m6.x0(null, i12, false), org.telegram.ui.ActionBar.m6.x0(null, i11, false), false, null);
        r0Var.setIcon(R.drawable.msg_clear);
        if (r0Var.getBackground() != null) {
            Drawable background = r0Var.getBackground();
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
            r0Var.setBackground(background);
            org.telegram.ui.ActionBar.t6.j(r0Var, background, null, M2, null);
        }
        if (r0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.t6.s(r0Var.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
        }
        r0Var.setContentDescription(org.telegram.messenger.id.M0(2131751598, null));
        r0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(r0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.b.add(r0Var);
        r0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z6
            public final /* synthetic */ t7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.b.F.d();
                        break;
                    default:
                        this.b.F.clear();
                        break;
                }
            }
        });
    }

    public static void a(t7 t7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.pj0 pj0Var) {
        ArrayList arrayList = o7Var.e;
        PhotoViewer.p1().H2(null, t7Var.e, null);
        if (t7Var.s == null) {
            t7Var.s = new h7(t7Var);
        }
        t7Var.s.a = pj0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.p1().e2(o7Var.r, arrayList.indexOf(m7Var), -1, false, t7Var.s, null);
        }
    }

    public static void b(t7 t7Var, ci.b bVar, k7 k7Var) {
        y6 y6Var = t7Var.e;
        org.telegram.ui.Components.pj0 listView = t7Var.getListView();
        if (k7Var.e == 2) {
            if (!(listView.getAdapter() instanceof l7)) {
                return;
            }
            PhotoViewer.p1().H2(null, y6Var, null);
            if (t7Var.s == null) {
                t7Var.s = new h7(t7Var);
            }
            t7Var.s.a = listView;
            File file = bVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new org.telegram.messenger.gf(0, file.getPath(), 0, bVar.d == 1, 0, 0));
                PhotoViewer.p1().e2(arrayList, 0, -1, false, t7Var.s, null);
            } else {
                org.telegram.messenger.g0.t2(file, file.getName(), null, y6Var.getParentActivity(), null, false);
            }
        }
        if (k7Var.e == 3) {
            if (!MediaController.B().I(bVar.f)) {
                MediaController.B().S(bVar.f);
            } else if (MediaController.B().H()) {
                MediaController.B().S(bVar.f);
            } else {
                MediaController.B().R(bVar.f, true);
            }
        }
    }

    public final org.telegram.ui.Components.pj0 c(View view) {
        if (view == null) {
            return null;
        }
        return view instanceof s7 ? ((s7) view).a : (org.telegram.ui.Components.pj0) view;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc A[LOOP:2: B:65:0x00f6->B:67:0x00fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.h != null) {
            int i7 = 0;
            while (true) {
                r7[] r7VarArr = this.r;
                if (i7 >= r7VarArr.length) {
                    break;
                }
                r7 r7Var = r7VarArr[i7];
                if (r7Var != null) {
                    if (r7Var.b == 0 && !this.h.b.isEmpty()) {
                        arrayList2.add(r7VarArr[i7]);
                    } else if (r7VarArr[i7].b == 1 && !this.h.d.isEmpty()) {
                        arrayList2.add(r7VarArr[i7]);
                    } else if (r7VarArr[i7].b == 2 && !this.h.e.isEmpty()) {
                        arrayList2.add(r7VarArr[i7]);
                    } else if (r7VarArr[i7].b == 3 && !this.h.f.isEmpty()) {
                        arrayList2.add(r7VarArr[i7]);
                    } else if (r7VarArr[i7].b == 5 && !this.h.g.isEmpty()) {
                        arrayList2.add(r7VarArr[i7]);
                    } else if (r7VarArr[i7].b == 4 && !this.h.h.isEmpty()) {
                        arrayList2.add(r7VarArr[i7]);
                    }
                }
                i7++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.v61 v61Var = this.n;
        if (size == 1 && this.h.a) {
            this.d.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) v61Var.getLayoutParams()).topMargin = 0;
        }
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        org.telegram.ui.Components.it0 it0Var = this.x;
        if (size2 == size3) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((r7) arrayList.get(i10)).b == ((r7) arrayList2.get(i10)).b) {
                }
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                f7 f7Var = ((r7) arrayList2.get(i11)).c;
                ((r7) arrayList2.get(i11)).c.F();
            }
            if (it0Var == null) {
                it0Var.p();
                return;
            }
            return;
        }
        v61Var.D(it0Var == null);
        while (i11 < arrayList2.size()) {
        }
        if (it0Var == null) {
        }
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.v61 v61Var = this.n;
            if (i7 >= v61Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.pj0 c10 = c(v61Var.getViewPages()[i7]);
            if (c10 != null) {
                org.telegram.messenger.g0.b4(c10);
            }
            i7++;
        }
    }

    public org.telegram.ui.Components.pj0 getListView() {
        return c(this.n.getCurrentView());
    }

    public org.telegram.ui.Components.v61 getViewPager() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.E);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.E);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    public void setCacheModel(ci.c cVar) {
        this.h = cVar;
        d();
    }

    public void setDelegate(i7 i7Var) {
        this.F = i7Var;
    }

    public void setTargetTabsPosition(int i7) {
        this.y = i7;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.a.a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
