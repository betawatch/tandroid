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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class x7 extends FrameLayout implements org.telegram.ui.ActionBar.p6, org.telegram.ui.Components.ed0 {
    public final i7 E;
    public m7 F;
    public final org.telegram.ui.ActionBar.j2 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final org.telegram.ui.Components.u91 d;
    public final c7 e;
    public final ArrayList f;
    public ci.b h;
    public final org.telegram.ui.Components.v91 n;
    public final v7[] r;
    public l7 s;
    public int v;
    public final org.telegram.ui.Components.mw0 w;
    public int x;
    public boolean y;

    public x7(Context context, c7 c7Var, oi.q qVar, org.telegram.ui.Components.mw0 mw0Var) {
        super(context);
        this.b = new ArrayList();
        this.f = new ArrayList();
        v7[] v7VarArr = new v7[5];
        this.r = v7VarArr;
        this.E = new i7(this, 0);
        this.e = c7Var;
        this.w = mw0Var;
        if (mw0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        v7VarArr[0] = new v7(LocaleController.getString(R.string.FilterChats), 0, new n7(this));
        v7VarArr[1] = new v7(LocaleController.getString(R.string.MediaTab), 1, new s7(this));
        v7VarArr[2] = new v7(LocaleController.getString(R.string.SharedFilesTab2), 2, new p7(this));
        v7VarArr[3] = new v7(LocaleController.getString(R.string.Music), 3, new u7(this));
        int i10 = 0;
        while (true) {
            v7[] v7VarArr2 = this.r;
            if (i10 >= v7VarArr2.length) {
                break;
            }
            v7 v7Var = v7VarArr2[i10];
            if (v7Var != null) {
                this.f.add(i10, v7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.v91 v91Var = mw0Var == null ? new org.telegram.ui.Components.v91(getContext(), null) : new org.telegram.ui.Components.pm0(context, c7Var.getResourceProvider(), mw0Var);
        this.n = v91Var;
        v91Var.setAllowDisallowInterceptTouch(false);
        if (qVar != null) {
            qVar.c(v91Var);
        }
        addView(v91Var, org.telegram.ui.Components.kb1.h(-1, -1.0f, 48, 0.0f, (qVar == null && mw0Var == null) ? 48.0f : 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.u91 n10 = v91Var.n(qVar != null ? -2 : 3, true);
        this.d = n10;
        frameLayout.addView(n10, org.telegram.ui.Components.kb1.g(48.0f, -1));
        if (qVar != null) {
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        addView(frameLayout, org.telegram.ui.Components.kb1.h(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        v91Var.setAdapter(new h7(this, context, qVar, c7Var, mw0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, org.telegram.ui.Components.kb1.g(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(true);
        this.a = j2Var;
        imageView.setImageDrawable(j2Var);
        int i11 = org.telegram.ui.ActionBar.y6.y8;
        j2Var.a(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.y6.z8;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, null);
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.b.add(imageView);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d7
            public final /* synthetic */ x7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.F.p();
                        break;
                    default:
                        this.b.F.clear();
                        break;
                }
            }
        });
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, true, true);
        s6Var.setTextSize(AndroidUtilities.dp(18.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.Z(s6Var, i11, null);
        linearLayout.addView(s6Var, org.telegram.ui.Components.kb1.q(1.0f, 0, -1, 18, 0, 0));
        this.b.add(s6Var);
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.y6.x0(null, i12, false), org.telegram.ui.ActionBar.y6.x0(null, i11, false), false, null);
        w0Var.setIcon(R.drawable.msg_clear);
        if (w0Var.getBackground() != null) {
            Drawable background = w0Var.getBackground();
            org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
            w0Var.setBackground(background);
            org.telegram.ui.ActionBar.f7.k(w0Var, background, null, N2, null);
        }
        if (w0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.f7.t(w0Var.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
        }
        w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        w0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.b.add(w0Var);
        final int i14 = 1;
        w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d7
            public final /* synthetic */ x7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.F.p();
                        break;
                    default:
                        this.b.F.clear();
                        break;
                }
            }
        });
    }

    public static void a(x7 x7Var, q7 q7Var, s7 s7Var, org.telegram.ui.Components.nm0 nm0Var) {
        ArrayList arrayList = s7Var.e;
        PhotoViewer.v1().N2(null, x7Var.e, null);
        if (x7Var.s == null) {
            x7Var.s = new l7(x7Var);
        }
        x7Var.s.a = nm0Var;
        if (arrayList.indexOf(q7Var) >= 0) {
            PhotoViewer.v1().j2(s7Var.r, arrayList.indexOf(q7Var), -1, false, x7Var.s, null);
        }
    }

    public static void b(x7 x7Var, ci.a aVar, o7 o7Var) {
        c7 c7Var = x7Var.e;
        org.telegram.ui.Components.nm0 listView = x7Var.getListView();
        if (o7Var.e == 2) {
            if (!(listView.getAdapter() instanceof p7)) {
                return;
            }
            PhotoViewer.v1().N2(null, c7Var, null);
            if (x7Var.s == null) {
                x7Var.s = new l7(x7Var);
            }
            x7Var.s.a = listView;
            File file = aVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, aVar.d == 1, 0, 0, 0L));
                PhotoViewer.v1().j2(arrayList, 0, -1, false, x7Var.s, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, c7Var.getParentActivity(), null, false);
            }
        }
        if (o7Var.e == 3) {
            if (!MediaController.getInstance().isPlayingMessage(aVar.f)) {
                MediaController.getInstance().playMessage(aVar.f);
            } else if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(aVar.f);
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(aVar.f);
            }
        }
    }

    public final org.telegram.ui.Components.nm0 c(View view) {
        if (view == null) {
            return null;
        }
        return view instanceof w7 ? ((w7) view).a : (org.telegram.ui.Components.nm0) view;
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
                v7[] v7VarArr = this.r;
                if (i10 >= v7VarArr.length) {
                    break;
                }
                v7 v7Var = v7VarArr[i10];
                if (v7Var != null) {
                    if (v7Var.b == 0 && !this.h.b.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    } else if (v7VarArr[i10].b == 1 && !this.h.d.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    } else if (v7VarArr[i10].b == 2 && !this.h.e.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    } else if (v7VarArr[i10].b == 3 && !this.h.f.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    } else if (v7VarArr[i10].b == 5 && !this.h.g.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    } else if (v7VarArr[i10].b == 4 && !this.h.h.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.v91 v91Var = this.n;
        if (size == 1 && this.h.a) {
            this.d.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) v91Var.getLayoutParams()).topMargin = 0;
        }
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        org.telegram.ui.Components.mw0 mw0Var = this.w;
        if (size2 == size3) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((v7) arrayList.get(i11)).b == ((v7) arrayList2.get(i11)).b) {
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                j7 j7Var = ((v7) arrayList2.get(i12)).c;
                ((v7) arrayList2.get(i12)).c.F();
            }
            if (mw0Var == null) {
                mw0Var.l();
                return;
            }
            return;
        }
        v91Var.D(mw0Var == null);
        while (i12 < arrayList2.size()) {
        }
        if (mw0Var == null) {
        }
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.v91 v91Var = this.n;
            if (i10 >= v91Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.nm0 c10 = c(v91Var.getViewPages()[i10]);
            if (c10 != null) {
                AndroidUtilities.updateVisibleRows(c10);
            }
            i10++;
        }
    }

    public org.telegram.ui.Components.nm0 getListView() {
        return c(this.n.getCurrentView());
    }

    public org.telegram.ui.Components.v91 getViewPager() {
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

    public void setCacheModel(ci.b bVar) {
        this.h = bVar;
        d();
    }

    public void setDelegate(m7 m7Var) {
        this.F = m7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.x = i10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.a.a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.y8, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
