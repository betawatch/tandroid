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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class s7 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.ui.Components.kb0 {
    public boolean E;
    public final d7 F;
    public h7 G;
    public final org.telegram.ui.ActionBar.x1 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final org.telegram.ui.Components.i71 d;
    public final x6 e;
    public final ArrayList f;
    public ei.c h;
    public final org.telegram.ui.Components.j71 n;
    public final q7[] r;
    public g7 s;
    public int w;
    public final org.telegram.ui.Components.tt0 x;
    public int y;

    public s7(Context context, x6 x6Var, ri.q qVar, org.telegram.ui.Components.tt0 tt0Var) {
        super(context);
        this.b = new ArrayList();
        this.f = new ArrayList();
        q7[] q7VarArr = new q7[5];
        this.r = q7VarArr;
        this.F = new d7(this, 0);
        this.e = x6Var;
        this.x = tt0Var;
        if (tt0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        q7VarArr[0] = new q7(org.telegram.messenger.gd.N0(2131750784, null), 0, new i7(this));
        final int i7 = 1;
        q7VarArr[1] = new q7(org.telegram.messenger.gd.N0(2131748458, null), 1, new n7(this));
        q7VarArr[2] = new q7(org.telegram.messenger.gd.N0(2131745218, null), 2, new k7(this));
        q7VarArr[3] = new q7(org.telegram.messenger.gd.N0(2131748126, null), 3, new p7(this));
        int i10 = 0;
        while (true) {
            q7[] q7VarArr2 = this.r;
            if (i10 >= q7VarArr2.length) {
                break;
            }
            q7 q7Var = q7VarArr2[i10];
            if (q7Var != null) {
                this.f.add(i10, q7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.j71 j71Var = tt0Var == null ? new org.telegram.ui.Components.j71(getContext(), null) : new org.telegram.ui.Components.gk0(context, x6Var.getResourceProvider(), tt0Var);
        this.n = j71Var;
        j71Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(j71Var);
        }
        addView(j71Var, c8.ma.d(-1, -1.0f, 48, 0.0f, (qVar == null && tt0Var == null) ? 48.0f : 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.i71 i11 = j71Var.i(qVar != null ? -2 : 3, true);
        this.d = i11;
        frameLayout.addView(i11, c8.ma.c(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        addView(frameLayout, c8.ma.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        j71Var.setAdapter(new c7(this, context, qVar, x6Var, tt0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, c8.ma.c(48.0f, -1));
        org.telegram.messenger.g0.X3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(true);
        this.a = x1Var;
        imageView.setImageDrawable(x1Var);
        int i12 = org.telegram.ui.ActionBar.m6.y8;
        x1Var.a(org.telegram.ui.ActionBar.m6.x0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.m6.z8;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i13, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i13);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131752029, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.b.add(imageView);
        final int i14 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y6
            public final /* synthetic */ s7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.G.k();
                        break;
                    default:
                        this.b.G.clear();
                        break;
                }
            }
        });
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        o6Var.setTextSize(org.telegram.messenger.g0.L(18.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.Y(o6Var, i12, null);
        linearLayout.addView(o6Var, c8.ma.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(o6Var);
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, org.telegram.ui.ActionBar.m6.x0(null, i13, false), org.telegram.ui.ActionBar.m6.x0(null, i12, false), false, null);
        q0Var.setIcon(R.drawable.msg_clear);
        if (q0Var.getBackground() != null) {
            Drawable background = q0Var.getBackground();
            org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i13);
            q0Var.setBackground(background);
            org.telegram.ui.ActionBar.t6.j(q0Var, background, null, M2, null);
        }
        if (q0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.t6.s(q0Var.getIconView(), i12, null, PorterDuff.Mode.SRC_IN);
        }
        q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131751586, null));
        q0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(q0Var, new LinearLayout.LayoutParams(org.telegram.messenger.g0.L(54.0f), -1));
        this.b.add(q0Var);
        q0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.y6
            public final /* synthetic */ s7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.b.G.k();
                        break;
                    default:
                        this.b.G.clear();
                        break;
                }
            }
        });
    }

    public static void a(s7 s7Var, l7 l7Var, n7 n7Var, org.telegram.ui.Components.ek0 ek0Var) {
        ArrayList arrayList = n7Var.e;
        PhotoViewer.p1().I2(null, s7Var.e, null);
        if (s7Var.s == null) {
            s7Var.s = new g7(s7Var);
        }
        s7Var.s.a = ek0Var;
        if (arrayList.indexOf(l7Var) >= 0) {
            PhotoViewer.p1().f2(n7Var.r, arrayList.indexOf(l7Var), -1, false, s7Var.s, null);
        }
    }

    public static void b(s7 s7Var, ei.b bVar, j7 j7Var) {
        x6 x6Var = s7Var.e;
        org.telegram.ui.Components.ek0 listView = s7Var.getListView();
        if (j7Var.e == 2) {
            if (!(listView.getAdapter() instanceof k7)) {
                return;
            }
            PhotoViewer.p1().I2(null, x6Var, null);
            if (s7Var.s == null) {
                s7Var.s = new g7(s7Var);
            }
            s7Var.s.a = listView;
            File file = bVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new org.telegram.messenger.ef(0, file.getPath(), 0, bVar.d == 1, 0, 0));
                PhotoViewer.p1().f2(arrayList, 0, -1, false, s7Var.s, null);
            } else {
                org.telegram.messenger.g0.t2(file, file.getName(), null, x6Var.getParentActivity(), null, false);
            }
        }
        if (j7Var.e == 3) {
            if (!MediaController.B().I(bVar.f)) {
                MediaController.B().S(bVar.f);
            } else if (MediaController.B().H()) {
                MediaController.B().S(bVar.f);
            } else {
                MediaController.B().R(bVar.f, true);
            }
        }
    }

    public final org.telegram.ui.Components.ek0 c(View view) {
        if (view == null) {
            return null;
        }
        return view instanceof r7 ? ((r7) view).a : (org.telegram.ui.Components.ek0) view;
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
                q7[] q7VarArr = this.r;
                if (i7 >= q7VarArr.length) {
                    break;
                }
                q7 q7Var = q7VarArr[i7];
                if (q7Var != null) {
                    if (q7Var.b == 0 && !this.h.b.isEmpty()) {
                        arrayList2.add(q7VarArr[i7]);
                    } else if (q7VarArr[i7].b == 1 && !this.h.d.isEmpty()) {
                        arrayList2.add(q7VarArr[i7]);
                    } else if (q7VarArr[i7].b == 2 && !this.h.e.isEmpty()) {
                        arrayList2.add(q7VarArr[i7]);
                    } else if (q7VarArr[i7].b == 3 && !this.h.f.isEmpty()) {
                        arrayList2.add(q7VarArr[i7]);
                    } else if (q7VarArr[i7].b == 5 && !this.h.g.isEmpty()) {
                        arrayList2.add(q7VarArr[i7]);
                    } else if (q7VarArr[i7].b == 4 && !this.h.h.isEmpty()) {
                        arrayList2.add(q7VarArr[i7]);
                    }
                }
                i7++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.j71 j71Var = this.n;
        if (size == 1 && this.h.a) {
            this.d.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) j71Var.getLayoutParams()).topMargin = 0;
        }
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        org.telegram.ui.Components.tt0 tt0Var = this.x;
        if (size2 == size3) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((q7) arrayList.get(i10)).b == ((q7) arrayList2.get(i10)).b) {
                }
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                e7 e7Var = ((q7) arrayList2.get(i11)).c;
                ((q7) arrayList2.get(i11)).c.F();
            }
            if (tt0Var == null) {
                tt0Var.p();
                return;
            }
            return;
        }
        j71Var.z(tt0Var == null);
        while (i11 < arrayList2.size()) {
        }
        if (tt0Var == null) {
        }
    }

    public final void e() {
        int i7 = 0;
        while (true) {
            org.telegram.ui.Components.j71 j71Var = this.n;
            if (i7 >= j71Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.ek0 c10 = c(j71Var.getViewPages()[i7]);
            if (c10 != null) {
                org.telegram.messenger.g0.Z3(c10);
            }
            i7++;
        }
    }

    public org.telegram.ui.Components.ek0 getListView() {
        return c(this.n.getCurrentView());
    }

    public org.telegram.ui.Components.j71 getViewPager() {
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
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    public void setCacheModel(ei.c cVar) {
        this.h = cVar;
        d();
    }

    public void setDelegate(h7 h7Var) {
        this.G = h7Var;
    }

    public void setTargetTabsPosition(int i7) {
        this.y = i7;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.a.a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.y8, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
