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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class u7 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.ui.Components.ta0 {
    public boolean E;
    public final f7 F;
    public j7 G;
    public final org.telegram.ui.ActionBar.w1 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final org.telegram.ui.Components.m61 d;
    public final z6 e;
    public final ArrayList f;
    public di.c h;
    public final org.telegram.ui.Components.n61 n;
    public final s7[] r;
    public i7 s;
    public int w;
    public final org.telegram.ui.Components.gt0 x;
    public int y;

    public u7(Context context, z6 z6Var, pi.q qVar, org.telegram.ui.Components.gt0 gt0Var) {
        super(context);
        this.b = new ArrayList();
        this.f = new ArrayList();
        s7[] s7VarArr = new s7[5];
        this.r = s7VarArr;
        this.F = new f7(this, 0);
        this.e = z6Var;
        this.x = gt0Var;
        if (gt0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        s7VarArr[0] = new s7(org.telegram.messenger.bd.M0(2131750797, null), 0, new k7(this));
        final int i3 = 1;
        s7VarArr[1] = new s7(org.telegram.messenger.bd.M0(2131748659, null), 1, new p7(this));
        s7VarArr[2] = new s7(org.telegram.messenger.bd.M0(2131745424, null), 2, new m7(this));
        s7VarArr[3] = new s7(org.telegram.messenger.bd.M0(2131748327, null), 3, new r7(this));
        int i10 = 0;
        while (true) {
            s7[] s7VarArr2 = this.r;
            if (i10 >= s7VarArr2.length) {
                break;
            }
            s7 s7Var = s7VarArr2[i10];
            if (s7Var != null) {
                this.f.add(i10, s7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.n61 n61Var = gt0Var == null ? new org.telegram.ui.Components.n61(getContext(), null) : new org.telegram.ui.Components.vj0(context, z6Var.getResourceProvider(), gt0Var);
        this.n = n61Var;
        n61Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(n61Var);
        }
        addView(n61Var, b8.mf.d(-1, -1.0f, 48, 0.0f, (qVar == null && gt0Var == null) ? 48.0f : 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.m61 j10 = n61Var.j(qVar != null ? -2 : 3, true);
        this.d = j10;
        frameLayout.addView(j10, b8.mf.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, b8.mf.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        n61Var.setAdapter(new e7(this, context, qVar, z6Var, gt0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, b8.mf.c(48.0f, -1));
        org.telegram.messenger.g0.Z3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(true);
        this.a = w1Var;
        imageView.setImageDrawable(w1Var);
        int i11 = org.telegram.ui.ActionBar.k6.y8;
        w1Var.a(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.k6.z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131752041, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.b.add(imageView);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a7
            public final /* synthetic */ u7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.G.d();
                        break;
                    default:
                        this.b.G.clear();
                        break;
                }
            }
        });
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, true);
        h6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.r6.Z(h6Var, i11, null);
        linearLayout.addView(h6Var, b8.mf.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(h6Var);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false), false, null);
        q0Var.setIcon(R.drawable.msg_clear);
        if (q0Var.getBackground() != null) {
            Drawable background = q0Var.getBackground();
            org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
            q0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(q0Var, background, null, N2, null);
        }
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.r6.t(q0Var.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
        }
        q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131751599, null));
        q0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(q0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.b.add(q0Var);
        q0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a7
            public final /* synthetic */ u7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.b.G.d();
                        break;
                    default:
                        this.b.G.clear();
                        break;
                }
            }
        });
    }

    public static void a(u7 u7Var, n7 n7Var, p7 p7Var, org.telegram.ui.Components.tj0 tj0Var) {
        ArrayList arrayList = p7Var.e;
        PhotoViewer.v1().N2(null, u7Var.e, null);
        if (u7Var.s == null) {
            u7Var.s = new i7(u7Var);
        }
        u7Var.s.a = tj0Var;
        if (arrayList.indexOf(n7Var) >= 0) {
            PhotoViewer.v1().j2(p7Var.r, arrayList.indexOf(n7Var), -1, false, u7Var.s, null);
        }
    }

    public static void b(u7 u7Var, di.b bVar, l7 l7Var) {
        z6 z6Var = u7Var.e;
        org.telegram.ui.Components.tj0 listView = u7Var.getListView();
        if (l7Var.e == 2) {
            if (!(listView.getAdapter() instanceof m7)) {
                return;
            }
            PhotoViewer.v1().N2(null, z6Var, null);
            if (u7Var.s == null) {
                u7Var.s = new i7(u7Var);
            }
            u7Var.s.a = listView;
            File file = bVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new org.telegram.messenger.ye(0, file.getPath(), 0, bVar.d == 1, 0, 0));
                PhotoViewer.v1().j2(arrayList, 0, -1, false, u7Var.s, null);
            } else {
                org.telegram.messenger.g0.t2(file, file.getName(), null, z6Var.getParentActivity(), null, false);
            }
        }
        if (l7Var.e == 3) {
            if (!MediaController.B().I(bVar.f)) {
                MediaController.B().S(bVar.f);
            } else if (MediaController.B().H()) {
                MediaController.B().S(bVar.f);
            } else {
                MediaController.B().R(bVar.f, true);
            }
        }
    }

    public final org.telegram.ui.Components.tj0 c(View view) {
        if (view == null) {
            return null;
        }
        return view instanceof t7 ? ((t7) view).a : (org.telegram.ui.Components.tj0) view;
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
            int i3 = 0;
            while (true) {
                s7[] s7VarArr = this.r;
                if (i3 >= s7VarArr.length) {
                    break;
                }
                s7 s7Var = s7VarArr[i3];
                if (s7Var != null) {
                    if (s7Var.b == 0 && !this.h.b.isEmpty()) {
                        arrayList2.add(s7VarArr[i3]);
                    } else if (s7VarArr[i3].b == 1 && !this.h.d.isEmpty()) {
                        arrayList2.add(s7VarArr[i3]);
                    } else if (s7VarArr[i3].b == 2 && !this.h.e.isEmpty()) {
                        arrayList2.add(s7VarArr[i3]);
                    } else if (s7VarArr[i3].b == 3 && !this.h.f.isEmpty()) {
                        arrayList2.add(s7VarArr[i3]);
                    } else if (s7VarArr[i3].b == 5 && !this.h.g.isEmpty()) {
                        arrayList2.add(s7VarArr[i3]);
                    } else if (s7VarArr[i3].b == 4 && !this.h.h.isEmpty()) {
                        arrayList2.add(s7VarArr[i3]);
                    }
                }
                i3++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.n61 n61Var = this.n;
        if (size == 1 && this.h.a) {
            this.d.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) n61Var.getLayoutParams()).topMargin = 0;
        }
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        org.telegram.ui.Components.gt0 gt0Var = this.x;
        if (size2 == size3) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((s7) arrayList.get(i10)).b == ((s7) arrayList2.get(i10)).b) {
                }
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                g7 g7Var = ((s7) arrayList2.get(i11)).c;
                ((s7) arrayList2.get(i11)).c.F();
            }
            if (gt0Var == null) {
                gt0Var.l();
                return;
            }
            return;
        }
        n61Var.C(gt0Var == null);
        while (i11 < arrayList2.size()) {
        }
        if (gt0Var == null) {
        }
    }

    public final void e() {
        int i3 = 0;
        while (true) {
            org.telegram.ui.Components.n61 n61Var = this.n;
            if (i3 >= n61Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.tj0 c2 = c(n61Var.getViewPages()[i3]);
            if (c2 != null) {
                org.telegram.messenger.g0.b4(c2);
            }
            i3++;
        }
    }

    public org.telegram.ui.Components.tj0 getListView() {
        return c(this.n.getCurrentView());
    }

    public org.telegram.ui.Components.n61 getViewPager() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.F);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    public void setCacheModel(di.c cVar) {
        this.h = cVar;
        d();
    }

    public void setDelegate(j7 j7Var) {
        this.G = j7Var;
    }

    public void setTargetTabsPosition(int i3) {
        this.y = i3;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.a.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
