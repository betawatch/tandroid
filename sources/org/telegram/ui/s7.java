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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class s7 extends FrameLayout implements org.telegram.ui.Components.mc0 {
    public final ArrayList a;
    public final org.telegram.ui.Components.h81 b;
    public final View c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final ArrayList e;
    public ai.c f;
    public final org.telegram.ui.Components.i81 h;
    public final r7[] n;
    public h7 r;
    public int s;
    public i7 v;

    public s7(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.a = new ArrayList();
        this.e = new ArrayList();
        r7[] r7VarArr = new r7[5];
        this.n = r7VarArr;
        this.d = n2Var;
        r7VarArr[0] = new r7(LocaleController.getString(R.string.FilterChats), 0, new j7(this));
        r7VarArr[1] = new r7(LocaleController.getString(R.string.MediaTab), 1, new o7(this));
        r7VarArr[2] = new r7(LocaleController.getString(R.string.SharedFilesTab2), 2, new l7(this));
        r7VarArr[3] = new r7(LocaleController.getString(R.string.Music), 3, new q7(this));
        int i10 = 0;
        while (true) {
            r7[] r7VarArr2 = this.n;
            if (i10 >= r7VarArr2.length) {
                org.telegram.ui.Components.i81 i81Var = new org.telegram.ui.Components.i81(getContext(), null);
                this.h = i81Var;
                i81Var.setAllowDisallowInterceptTouch(false);
                addView(i81Var, w7.x5.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.h81 n10 = i81Var.n(3, true);
                this.b = n10;
                addView(n10, w7.x5.c(48.0f, -1));
                View view = new View(getContext());
                this.c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d7, false));
                addView(view, w7.x5.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                i81Var.setAdapter(new e7(this, context, n2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.x5.c(48.0f, -1));
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
                    public final /* synthetic */ s7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                this.b.v.i1();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, true, true);
                q6Var.setTextSize(AndroidUtilities.dp(18.0f));
                q6Var.setTypeface(AndroidUtilities.bold());
                q6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                linearLayout.addView(q6Var, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
                this.a.add(q6Var);
                org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), false, null);
                v0Var.setIcon(R.drawable.msg_clear);
                v0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                v0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(v0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(v0Var);
                final int i14 = 1;
                v0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.a7
                    public final /* synthetic */ s7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                this.b.v.i1();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                return;
            }
            r7 r7Var = r7VarArr2[i10];
            if (r7Var != null) {
                this.e.add(i10, r7Var);
            }
            i10++;
        }
    }

    public static void a(s7 s7Var, m7 m7Var, o7 o7Var, org.telegram.ui.Components.ll0 ll0Var) {
        ArrayList arrayList = o7Var.e;
        PhotoViewer.t1().K2(null, s7Var.d, null);
        if (s7Var.r == null) {
            s7Var.r = new h7(s7Var);
        }
        s7Var.r.a = ll0Var;
        if (arrayList.indexOf(m7Var) >= 0) {
            PhotoViewer.t1().f2(o7Var.r, arrayList.indexOf(m7Var), -1, false, s7Var.r, null);
        }
    }

    public static void b(s7 s7Var, ai.b bVar, k7 k7Var) {
        org.telegram.ui.ActionBar.n2 n2Var = s7Var.d;
        org.telegram.ui.Components.ll0 ll0Var = (org.telegram.ui.Components.ll0) s7Var.h.getCurrentView();
        if (k7Var.e == 2) {
            if (!(ll0Var.getAdapter() instanceof l7)) {
                return;
            }
            PhotoViewer.t1().K2(null, n2Var, null);
            if (s7Var.r == null) {
                s7Var.r = new h7(s7Var);
            }
            s7Var.r.a = ll0Var;
            File file = bVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, bVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().f2(arrayList, 0, -1, false, s7Var.r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, n2Var.getParentActivity(), null, false);
            }
        }
        if (k7Var.e == 3) {
            if (!MediaController.getInstance().isPlayingMessage(bVar.f)) {
                MediaController.getInstance().playMessage(bVar.f);
            } else if (MediaController.getInstance().isMessagePaused()) {
                MediaController.getInstance().playMessage(bVar.f);
            } else {
                MediaController.getInstance().lambda$startAudioAgain$7(bVar.f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0100 A[LOOP:2: B:65:0x00fa->B:67:0x0100, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.f != null) {
            int i10 = 0;
            while (true) {
                r7[] r7VarArr = this.n;
                if (i10 >= r7VarArr.length) {
                    break;
                }
                r7 r7Var = r7VarArr[i10];
                if (r7Var != null) {
                    if (r7Var.b == 0 && !this.f.b.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].b == 1 && !this.f.d.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].b == 2 && !this.f.e.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].b == 3 && !this.f.f.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].b == 5 && !this.f.g.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    } else if (r7VarArr[i10].b == 4 && !this.f.h.isEmpty()) {
                        arrayList2.add(r7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.i81 i81Var = this.h;
        if (size == 1 && this.f.a) {
            this.b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) i81Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((r7) arrayList.get(i11)).b == ((r7) arrayList2.get(i11)).b) {
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                f7 f7Var = ((r7) arrayList2.get(i12)).c;
                ((r7) arrayList2.get(i12)).c.F();
            }
        }
        i81Var.C(true);
        while (i12 < arrayList2.size()) {
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.i81 i81Var = this.h;
            if (i10 >= i81Var.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.ll0) i81Var.getViewPages()[i10]);
            i10++;
        }
    }

    public org.telegram.ui.Components.ll0 getListView() {
        org.telegram.ui.Components.i81 i81Var = this.h;
        if (i81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.ll0) i81Var.getCurrentView();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public void setBottomPadding(int i10) {
        this.s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.i81 i81Var = this.h;
            if (i11 >= i81Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.ll0 ll0Var = (org.telegram.ui.Components.ll0) i81Var.getViewPages()[i11];
            if (ll0Var != null) {
                ll0Var.setPadding(0, 0, 0, i10);
            }
            i11++;
        }
    }

    public void setCacheModel(ai.c cVar) {
        this.f = cVar;
        c();
    }

    public void setDelegate(i7 i7Var) {
        this.v = i7Var;
    }
}
