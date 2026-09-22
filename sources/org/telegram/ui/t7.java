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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class t7 extends FrameLayout implements org.telegram.ui.Components.wc0 {
    public j7 E;
    public final ArrayList a;
    public final FrameLayout b;
    public final org.telegram.ui.Components.y81 c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final ArrayList e;
    public zh.b f;
    public final org.telegram.ui.Components.z81 h;
    public final s7[] n;
    public i7 r;
    public int s;
    public int v;
    public int w;
    public boolean x;
    public final f7 y;

    public t7(Context context, org.telegram.ui.ActionBar.n2 n2Var, li.i iVar) {
        super(context);
        this.a = new ArrayList();
        this.e = new ArrayList();
        s7[] s7VarArr = new s7[5];
        this.n = s7VarArr;
        this.y = new f7(this, 0);
        this.d = n2Var;
        s7VarArr[0] = new s7(LocaleController.getString(R.string.FilterChats), 0, new k7(this));
        s7VarArr[1] = new s7(LocaleController.getString(R.string.MediaTab), 1, new p7(this));
        s7VarArr[2] = new s7(LocaleController.getString(R.string.SharedFilesTab2), 2, new m7(this));
        s7VarArr[3] = new s7(LocaleController.getString(R.string.Music), 3, new r7(this));
        int i10 = 0;
        while (true) {
            s7[] s7VarArr2 = this.n;
            if (i10 >= s7VarArr2.length) {
                break;
            }
            s7 s7Var = s7VarArr2[i10];
            if (s7Var != null) {
                this.e.add(i10, s7Var);
            }
            i10++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        org.telegram.ui.Components.z81 z81Var = new org.telegram.ui.Components.z81(getContext(), null);
        this.h = z81Var;
        z81Var.setAllowDisallowInterceptTouch(false);
        if (iVar != null) {
            z81Var.Q.add(new li.e(iVar));
        }
        addView(z81Var, w7.y5.d(-1, -1.0f, 48, 0.0f, iVar != null ? 0.0f : 48.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.y81 n10 = z81Var.n(iVar != null ? -2 : 3, true);
        this.c = n10;
        frameLayout.addView(n10, w7.y5.c(48.0f, -1));
        if (iVar != null) {
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        }
        addView(frameLayout, w7.y5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        z81Var.setAdapter(new e7(this, context, iVar, n2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.y5.c(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
        imageView.setImageDrawable(g2Var);
        int i11 = org.telegram.ui.ActionBar.j6.y8;
        g2Var.a(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.j6.z8;
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.a.add(imageView);
        final int i13 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a7
            public final /* synthetic */ t7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.E.h1();
                        break;
                    default:
                        this.b.E.clear();
                        break;
                }
            }
        });
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, true);
        o6Var.setTextSize(AndroidUtilities.dp(18.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        linearLayout.addView(o6Var, w7.y5.m(1.0f, 0, -1, 18, 0, 0));
        this.a.add(o6Var);
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), false, null);
        v0Var.setIcon(R.drawable.msg_clear);
        v0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        v0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(v0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.a.add(v0Var);
        final int i14 = 1;
        v0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a7
            public final /* synthetic */ t7 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.E.h1();
                        break;
                    default:
                        this.b.E.clear();
                        break;
                }
            }
        });
    }

    public static void a(t7 t7Var, n7 n7Var, p7 p7Var, org.telegram.ui.Components.yl0 yl0Var) {
        ArrayList arrayList = p7Var.e;
        PhotoViewer.t1().J2(null, t7Var.d, null);
        if (t7Var.r == null) {
            t7Var.r = new i7(t7Var);
        }
        t7Var.r.a = yl0Var;
        if (arrayList.indexOf(n7Var) >= 0) {
            PhotoViewer.t1().f2(p7Var.r, arrayList.indexOf(n7Var), -1, false, t7Var.r, null);
        }
    }

    public static void b(t7 t7Var, zh.a aVar, l7 l7Var) {
        org.telegram.ui.ActionBar.n2 n2Var = t7Var.d;
        org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) t7Var.h.getCurrentView();
        if (l7Var.e == 2) {
            if (!(yl0Var.getAdapter() instanceof m7)) {
                return;
            }
            PhotoViewer.t1().J2(null, n2Var, null);
            if (t7Var.r == null) {
                t7Var.r = new i7(t7Var);
            }
            t7Var.r.a = yl0Var;
            File file = aVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, aVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().f2(arrayList, 0, -1, false, t7Var.r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, n2Var.getParentActivity(), null, false);
            }
        }
        if (l7Var.e == 3) {
            if (!MediaController.getInstance().isPlayingMessage(aVar.f)) {
                MediaController.getInstance().playMessage(aVar.f);
            } else if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(aVar.f);
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(aVar.f);
            }
        }
    }

    public final void c(int i10, int i11) {
        this.s = i10;
        this.v = i11;
        int i12 = 0;
        while (true) {
            org.telegram.ui.Components.z81 z81Var = this.h;
            if (i12 >= z81Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) z81Var.getViewPages()[i12];
            if (yl0Var != null) {
                yl0Var.setPadding(yl0Var.getPaddingLeft(), i10, yl0Var.getPaddingRight(), i11);
            }
            i12++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6 A[LOOP:2: B:65:0x00f0->B:67:0x00f6, LOOP_END] */
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
                s7[] s7VarArr = this.n;
                if (i10 >= s7VarArr.length) {
                    break;
                }
                s7 s7Var = s7VarArr[i10];
                if (s7Var != null) {
                    if (s7Var.b == 0 && !this.f.b.isEmpty()) {
                        arrayList2.add(s7VarArr[i10]);
                    } else if (s7VarArr[i10].b == 1 && !this.f.d.isEmpty()) {
                        arrayList2.add(s7VarArr[i10]);
                    } else if (s7VarArr[i10].b == 2 && !this.f.e.isEmpty()) {
                        arrayList2.add(s7VarArr[i10]);
                    } else if (s7VarArr[i10].b == 3 && !this.f.f.isEmpty()) {
                        arrayList2.add(s7VarArr[i10]);
                    } else if (s7VarArr[i10].b == 5 && !this.f.g.isEmpty()) {
                        arrayList2.add(s7VarArr[i10]);
                    } else if (s7VarArr[i10].b == 4 && !this.f.h.isEmpty()) {
                        arrayList2.add(s7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.z81 z81Var = this.h;
        if (size == 1 && this.f.a) {
            this.c.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) z81Var.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((s7) arrayList.get(i11)).b == ((s7) arrayList2.get(i11)).b) {
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                g7 g7Var = ((s7) arrayList2.get(i12)).c;
                ((s7) arrayList2.get(i12)).c.F();
            }
        }
        z81Var.D(true);
        while (i12 < arrayList2.size()) {
        }
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.z81 z81Var = this.h;
            if (i10 >= z81Var.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.yl0) z81Var.getViewPages()[i10]);
            i10++;
        }
    }

    public org.telegram.ui.Components.yl0 getListView() {
        org.telegram.ui.Components.z81 z81Var = this.h;
        if (z81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.yl0) z81Var.getCurrentView();
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

    public void setDelegate(j7 j7Var) {
        this.E = j7Var;
    }

    public void setTargetTabsPosition(int i10) {
        this.w = i10;
    }
}
