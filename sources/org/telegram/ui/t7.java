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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class t7 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.ui.Components.rb0 {
    public boolean D;
    public final e7 E;
    public i7 F;
    public final org.telegram.ui.ActionBar.c2 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final org.telegram.ui.Components.v71 d;
    public final y6 e;
    public final ArrayList f;
    public sh.b h;
    public final org.telegram.ui.Components.w71 n;
    public final r7[] r;
    public h7 s;
    public int w;
    public final org.telegram.ui.Components.ku0 x;
    public int y;

    public t7(Context context, y6 y6Var, ei.r rVar, org.telegram.ui.Components.ku0 ku0Var) {
        super(context);
        this.b = new ArrayList();
        this.f = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.r = r7VarArr;
        this.E = new e7(this, 0);
        this.e = y6Var;
        this.x = ku0Var;
        if (ku0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        r7VarArr[0] = new r7(org.telegram.messenger.cd.L0(2131750797, null), 0, new j7(this));
        final int i10 = 1;
        r7VarArr[1] = new r7(org.telegram.messenger.cd.L0(2131748666, null), 1, new o7(this));
        r7VarArr[2] = new r7(org.telegram.messenger.cd.L0(2131745432, null), 2, new l7(this));
        r7VarArr[3] = new r7(org.telegram.messenger.cd.L0(2131748334, null), 3, new q7(this));
        int i11 = 0;
        while (true) {
            r7[] r7VarArr2 = this.r;
            if (i11 >= r7VarArr2.length) {
                break;
            }
            r7 r7Var = r7VarArr2[i11];
            if (r7Var != null) {
                this.f.add(i11, r7Var);
            }
            i11++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.w71 w71Var = ku0Var == null ? new org.telegram.ui.Components.w71(getContext(), null) : new org.telegram.ui.Components.vk0(context, y6Var.getResourceProvider(), ku0Var);
        this.n = w71Var;
        w71Var.setAllowDisallowInterceptTouch(false);
        if (rVar != null) {
            rVar.c(w71Var);
        }
        addView(w71Var, w7.b6.d(-1, -1.0f, 48, 0.0f, (rVar == null && ku0Var == null) ? 48.0f : 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.v71 n10 = w71Var.n(rVar != null ? -2 : 3, true);
        this.d = n10;
        frameLayout.addView(n10, w7.b6.c(48.0f, -1));
        if (rVar != null) {
            frameLayout.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        }
        addView(frameLayout, w7.b6.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        w71Var.setAdapter(new d7(this, context, rVar, y6Var, ku0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.b6.c(48.0f, -1));
        org.telegram.messenger.i0.Y3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(true);
        this.a = c2Var;
        imageView.setImageDrawable(c2Var);
        int i12 = org.telegram.ui.ActionBar.t6.y8;
        c2Var.a(org.telegram.ui.ActionBar.t6.x0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.t6.z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i13, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131752041, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(54.0f), -1));
        this.b.add(imageView);
        final int i14 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z6
            public final /* synthetic */ t7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.F.d();
                        break;
                    default:
                        this.b.F.clear();
                        break;
                }
            }
        });
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, true);
        f6Var.setTextSize(org.telegram.messenger.i0.L(18.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        org.telegram.ui.ActionBar.a7.Z(f6Var, i12, null);
        linearLayout.addView(f6Var, w7.b6.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(f6Var);
        org.telegram.ui.ActionBar.t0 t0Var = new org.telegram.ui.ActionBar.t0(context, null, org.telegram.ui.ActionBar.t6.x0(null, i13, false), org.telegram.ui.ActionBar.t6.x0(null, i12, false), false, null);
        t0Var.setIcon(R.drawable.msg_clear);
        if (t0Var.getBackground() != null) {
            Drawable background = t0Var.getBackground();
            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i13);
            t0Var.setBackground(background);
            org.telegram.ui.ActionBar.a7.k(t0Var, background, null, N2, null);
        }
        if (t0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.a7.t(t0Var.getIconView(), i12, null, PorterDuff.Mode.SRC_IN);
        }
        t0Var.setContentDescription(org.telegram.messenger.cd.L0(2131751599, null));
        t0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(t0Var, new LinearLayout.LayoutParams(org.telegram.messenger.i0.L(54.0f), -1));
        this.b.add(t0Var);
        t0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z6
            public final /* synthetic */ t7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
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

    public static void a(t7 t7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.tk0 tk0Var) {
        ArrayList arrayList = o7Var.e;
        PhotoViewer.v1().N2(null, t7Var.e, null);
        if (t7Var.s == null) {
            t7Var.s = new h7(t7Var);
        }
        t7Var.s.a = tk0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.v1().j2(o7Var.r, arrayList.indexOf(m7Var), -1, false, t7Var.s, null);
        }
    }

    public static void b(t7 t7Var, sh.a aVar, k7 k7Var) {
        y6 y6Var = t7Var.e;
        org.telegram.ui.Components.tk0 listView = t7Var.getListView();
        if (k7Var.e == 2) {
            if (!(listView.getAdapter() instanceof l7)) {
                return;
            }
            PhotoViewer.v1().N2(null, y6Var, null);
            if (t7Var.s == null) {
                t7Var.s = new h7(t7Var);
            }
            t7Var.s.a = listView;
            File file = aVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new org.telegram.messenger.ef(0, file.getPath(), 0, aVar.d == 1, 0, 0));
                PhotoViewer.v1().j2(arrayList, 0, -1, false, t7Var.s, null);
            } else {
                org.telegram.messenger.i0.t2(file, file.getName(), null, y6Var.getParentActivity(), null, false);
            }
        }
        if (k7Var.e == 3) {
            if (!MediaController.B().I(aVar.f)) {
                MediaController.B().S(aVar.f);
            } else if (MediaController.B().H()) {
                MediaController.B().S(aVar.f);
            } else {
                MediaController.B().R(aVar.f, true);
            }
        }
    }

    public final org.telegram.ui.Components.tk0 c(View view) {
        if (view == null) {
            return null;
        }
        return view instanceof s7 ? ((s7) view).a : (org.telegram.ui.Components.tk0) view;
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
            int i10 = 0;
            while (true) {
                r7[] r7VarArr = this.r;
                if (i10 >= r7VarArr.length) {
                    break;
                }
                r7 r7Var = r7VarArr[i10];
                if (r7Var != null) {
                    if (r7Var.b == 0 && !this.h.b.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].b == 1 && !this.h.d.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].b == 2 && !this.h.e.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].b == 3 && !this.h.f.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].b == 5 && !this.h.g.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].b == 4 && !this.h.h.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.w71 w71Var = this.n;
        if (size == 1 && this.h.a) {
            this.d.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) w71Var.getLayoutParams()).topMargin = 0;
        }
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        org.telegram.ui.Components.ku0 ku0Var = this.x;
        if (size2 == size3) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((r7) arrayList.get(i11)).b == ((r7) arrayList2.get(i11)).b) {
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                f7 f7Var = ((r7) arrayList2.get(i12)).c;
                ((r7) arrayList2.get(i12)).c.F();
            }
            if (ku0Var == null) {
                ku0Var.p();
                return;
            }
            return;
        }
        w71Var.D(ku0Var == null);
        while (i12 < arrayList2.size()) {
        }
        if (ku0Var == null) {
        }
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.w71 w71Var = this.n;
            if (i10 >= w71Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.tk0 c10 = c(w71Var.getViewPages()[i10]);
            if (c10 != null) {
                org.telegram.messenger.i0.a4(c10);
            }
            i10++;
        }
    }

    public org.telegram.ui.Components.tk0 getListView() {
        return c(this.n.getCurrentView());
    }

    public org.telegram.ui.Components.w71 getViewPager() {
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
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public void setCacheModel(sh.b bVar) {
        this.h = bVar;
        d();
    }

    public void setDelegate(i7 i7Var) {
        this.F = i7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.y = i10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.a.a(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y8, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
