package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public abstract class v7 extends FrameLayout implements org.telegram.ui.Components.xc0 {
    public k7 E;
    public final ArrayList a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.g91 c;
    public final a7 d;
    public final ArrayList e;
    public zh.b f;
    public final org.telegram.ui.Components.h91 h;
    public final t7[] n;
    public j7 r;
    public int s;
    public final org.telegram.ui.Components.bw0 v;
    public int w;
    public boolean x;
    public final g7 y;

    public v7(Context context, a7 a7Var, li.p pVar, org.telegram.ui.Components.bw0 bw0Var) {
        super(context);
        this.a = new ArrayList();
        this.e = new ArrayList();
        t7[] t7VarArr = new t7[5];
        this.n = t7VarArr;
        this.y = new g7(this, 0);
        this.d = a7Var;
        this.v = bw0Var;
        if (bw0Var != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        t7VarArr[0] = new t7(LocaleController.getString(R.string.FilterChats), 0, new l7(this));
        t7VarArr[1] = new t7(LocaleController.getString(R.string.MediaTab), 1, new q7(this));
        t7VarArr[2] = new t7(LocaleController.getString(R.string.SharedFilesTab2), 2, new n7(this));
        t7VarArr[3] = new t7(LocaleController.getString(R.string.Music), 3, new s7(this));
        int i10 = 0;
        while (true) {
            t7[] t7VarArr2 = this.n;
            if (i10 >= t7VarArr2.length) {
                break;
            }
            t7 t7Var = t7VarArr2[i10];
            if (t7Var != null) {
                this.e.add(i10, t7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        org.telegram.ui.Components.h91 h91Var = bw0Var == null ? new org.telegram.ui.Components.h91(getContext(), null) : new org.telegram.ui.Components.bm0(context, a7Var.getResourceProvider(), bw0Var);
        this.h = h91Var;
        h91Var.setAllowDisallowInterceptTouch(false);
        if (pVar != null) {
            pVar.c(h91Var);
        }
        addView(h91Var, w7.z5.d(-1, -1.0f, 48, 0.0f, (pVar == null && bw0Var == null) ? 48.0f : 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.g91 n10 = h91Var.n(pVar != null ? -2 : 3, true);
        this.c = n10;
        frameLayout.addView(n10, w7.z5.c(48.0f, -1));
        if (pVar != null) {
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        addView(frameLayout, w7.z5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        h91Var.setAdapter(new f7(this, context, pVar, a7Var, bw0Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.z5.c(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
        imageView.setImageDrawable(g2Var);
        int i11 = org.telegram.ui.ActionBar.i6.y8;
        g2Var.a(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.i6.z8;
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, i12, false), 1, -1));
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.a.add(imageView);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b7
            public final /* synthetic */ v7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.E.i();
                        break;
                    default:
                        this.b.E.clear();
                        break;
                }
            }
        });
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, true);
        p6Var.setTextSize(AndroidUtilities.dp(18.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        linearLayout.addView(p6Var, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
        this.a.add(p6Var);
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, org.telegram.ui.ActionBar.i6.w0(null, i12, false), org.telegram.ui.ActionBar.i6.w0(null, i11, false), false, null);
        v0Var.setIcon(R.drawable.msg_clear);
        v0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        v0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(v0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.a.add(v0Var);
        final int i14 = 1;
        v0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.b7
            public final /* synthetic */ v7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.E.i();
                        break;
                    default:
                        this.b.E.clear();
                        break;
                }
            }
        });
    }

    public static void a(v7 v7Var, o7 o7Var, q7 q7Var, org.telegram.ui.Components.zl0 zl0Var) {
        ArrayList arrayList = q7Var.e;
        PhotoViewer.t1().K2(null, v7Var.d, null);
        if (v7Var.r == null) {
            v7Var.r = new j7(v7Var);
        }
        v7Var.r.a = zl0Var;
        if (arrayList.indexOf(o7Var) >= 0) {
            PhotoViewer.t1().g2(q7Var.r, arrayList.indexOf(o7Var), -1, false, v7Var.r, null);
        }
    }

    public static void b(v7 v7Var, zh.a aVar, m7 m7Var) {
        a7 a7Var = v7Var.d;
        org.telegram.ui.Components.zl0 listView = v7Var.getListView();
        if (m7Var.e == 2) {
            if (!(listView.getAdapter() instanceof n7)) {
                return;
            }
            PhotoViewer.t1().K2(null, a7Var, null);
            if (v7Var.r == null) {
                v7Var.r = new j7(v7Var);
            }
            v7Var.r.a = listView;
            File file = aVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, aVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().g2(arrayList, 0, -1, false, v7Var.r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, a7Var.getParentActivity(), null, false);
            }
        }
        if (m7Var.e == 3) {
            if (!MediaController.getInstance().isPlayingMessage(aVar.f)) {
                MediaController.getInstance().playMessage(aVar.f);
            } else if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(aVar.f);
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(aVar.f);
            }
        }
    }

    public static org.telegram.ui.Components.zl0 c(View view) {
        if (view == null) {
            return null;
        }
        return view instanceof u7 ? ((u7) view).a : (org.telegram.ui.Components.zl0) view;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00fc A[LOOP:2: B:65:0x00f6->B:67:0x00fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                t7[] t7VarArr = this.n;
                if (i10 >= t7VarArr.length) {
                    break;
                }
                t7 t7Var = t7VarArr[i10];
                if (t7Var != null) {
                    if (t7Var.b == 0 && !this.f.b.isEmpty()) {
                        arrayList2.add(t7VarArr[i10]);
                    } else if (t7VarArr[i10].b == 1 && !this.f.d.isEmpty()) {
                        arrayList2.add(t7VarArr[i10]);
                    } else if (t7VarArr[i10].b == 2 && !this.f.e.isEmpty()) {
                        arrayList2.add(t7VarArr[i10]);
                    } else if (t7VarArr[i10].b == 3 && !this.f.f.isEmpty()) {
                        arrayList2.add(t7VarArr[i10]);
                    } else if (t7VarArr[i10].b == 5 && !this.f.g.isEmpty()) {
                        arrayList2.add(t7VarArr[i10]);
                    } else if (t7VarArr[i10].b == 4 && !this.f.h.isEmpty()) {
                        arrayList2.add(t7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.h91 h91Var = this.h;
        if (size == 1 && this.f.a) {
            this.c.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) h91Var.getLayoutParams()).topMargin = 0;
        }
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        org.telegram.ui.Components.bw0 bw0Var = this.v;
        if (size2 == size3) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((t7) arrayList.get(i11)).b == ((t7) arrayList2.get(i11)).b) {
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                h7 h7Var = ((t7) arrayList2.get(i12)).c;
                ((t7) arrayList2.get(i12)).c.F();
            }
            if (bw0Var == null) {
                bw0Var.l();
                return;
            }
            return;
        }
        h91Var.D(bw0Var == null);
        while (i12 < arrayList2.size()) {
        }
        if (bw0Var == null) {
        }
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.h91 h91Var = this.h;
            if (i10 >= h91Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.zl0 c10 = c(h91Var.getViewPages()[i10]);
            if (c10 != null) {
                AndroidUtilities.updateVisibleRows(c10);
            }
            i10++;
        }
    }

    public org.telegram.ui.Components.zl0 getListView() {
        return c(this.h.getCurrentView());
    }

    public org.telegram.ui.Components.h91 getViewPager() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.y);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.y);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public void setCacheModel(zh.b bVar) {
        this.f = bVar;
        d();
    }

    public void setDelegate(k7 k7Var) {
        this.E = k7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.w = i10;
    }
}
