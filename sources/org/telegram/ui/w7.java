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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class w7 extends FrameLayout implements org.telegram.ui.Components.oc0 {
    public final ArrayList a;
    public final org.telegram.ui.Components.k81 b;
    public final View c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final ArrayList e;
    public mh.b f;
    public final org.telegram.ui.Components.l81 h;
    public final v7[] n;
    public l7 r;
    public int s;
    public m7 v;

    public w7(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        this.a = new ArrayList();
        this.e = new ArrayList();
        v7[] v7VarArr = new v7[5];
        this.n = v7VarArr;
        this.d = p2Var;
        v7VarArr[0] = new v7(LocaleController.getString(R.string.FilterChats), 0, new n7(this));
        v7VarArr[1] = new v7(LocaleController.getString(R.string.MediaTab), 1, new s7(this));
        v7VarArr[2] = new v7(LocaleController.getString(R.string.SharedFilesTab2), 2, new p7(this));
        v7VarArr[3] = new v7(LocaleController.getString(R.string.Music), 3, new u7(this));
        int i10 = 0;
        while (true) {
            v7[] v7VarArr2 = this.n;
            if (i10 >= v7VarArr2.length) {
                org.telegram.ui.Components.l81 l81Var = new org.telegram.ui.Components.l81(getContext(), null);
                this.h = l81Var;
                l81Var.setAllowDisallowInterceptTouch(false);
                addView(l81Var, k7.b6.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.k81 n10 = l81Var.n(3, true);
                this.b = n10;
                addView(n10, k7.b6.c(48.0f, -1));
                View view = new View(getContext());
                this.c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d7, false));
                addView(view, k7.b6.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                l81Var.setAdapter(new i7(this, context, p2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, k7.b6.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(true);
                imageView.setImageDrawable(i2Var);
                int i11 = org.telegram.ui.ActionBar.j6.y8;
                i2Var.a(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.j6.z8;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(imageView);
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e7
                    public final /* synthetic */ w7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                this.b.v.g1();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
                k6Var.setTextSize(AndroidUtilities.dp(18.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                linearLayout.addView(k6Var, k7.b6.m(1.0f, 0, -1, 18, 0, 0));
                this.a.add(k6Var);
                org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.j6.w0(null, i12, false), org.telegram.ui.ActionBar.j6.w0(null, i11, false), false, null);
                w0Var.setIcon(R.drawable.msg_clear);
                w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                w0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(w0Var);
                final int i14 = 1;
                w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e7
                    public final /* synthetic */ w7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                this.b.v.g1();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                return;
            }
            v7 v7Var = v7VarArr2[i10];
            if (v7Var != null) {
                this.e.add(i10, v7Var);
            }
            i10++;
        }
    }

    public static void a(w7 w7Var, q7 q7Var, s7 s7Var, org.telegram.ui.Components.rl0 rl0Var) {
        ArrayList arrayList = s7Var.e;
        PhotoViewer.t1().K2(null, w7Var.d, null);
        if (w7Var.r == null) {
            w7Var.r = new l7(w7Var);
        }
        w7Var.r.a = rl0Var;
        if (arrayList.indexOf(q7Var) >= 0) {
            PhotoViewer.t1().f2(s7Var.r, arrayList.indexOf(q7Var), -1, false, w7Var.r, null);
        }
    }

    public static void b(w7 w7Var, mh.a aVar, o7 o7Var) {
        org.telegram.ui.ActionBar.p2 p2Var = w7Var.d;
        org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) w7Var.h.getCurrentView();
        if (o7Var.e == 2) {
            if (!(rl0Var.getAdapter() instanceof p7)) {
                return;
            }
            PhotoViewer.t1().K2(null, p2Var, null);
            if (w7Var.r == null) {
                w7Var.r = new l7(w7Var);
            }
            w7Var.r.a = rl0Var;
            File file = aVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, aVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().f2(arrayList, 0, -1, false, w7Var.r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, p2Var.getParentActivity(), null, false);
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
                v7[] v7VarArr = this.n;
                if (i10 >= v7VarArr.length) {
                    break;
                }
                v7 v7Var = v7VarArr[i10];
                if (v7Var != null) {
                    if (v7Var.b == 0 && !this.f.b.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    } else if (v7VarArr[i10].b == 1 && !this.f.d.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    } else if (v7VarArr[i10].b == 2 && !this.f.e.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    } else if (v7VarArr[i10].b == 3 && !this.f.f.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    } else if (v7VarArr[i10].b == 5 && !this.f.g.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    } else if (v7VarArr[i10].b == 4 && !this.f.h.isEmpty()) {
                        arrayList2.add(v7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.l81 l81Var = this.h;
        if (size == 1 && this.f.a) {
            this.b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) l81Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((v7) arrayList.get(i11)).b == ((v7) arrayList2.get(i11)).b) {
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                j7 j7Var = ((v7) arrayList2.get(i12)).c;
                ((v7) arrayList2.get(i12)).c.F();
            }
        }
        l81Var.C(true);
        while (i12 < arrayList2.size()) {
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.l81 l81Var = this.h;
            if (i10 >= l81Var.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.rl0) l81Var.getViewPages()[i10]);
            i10++;
        }
    }

    public org.telegram.ui.Components.rl0 getListView() {
        org.telegram.ui.Components.l81 l81Var = this.h;
        if (l81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.rl0) l81Var.getCurrentView();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public void setBottomPadding(int i10) {
        this.s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.l81 l81Var = this.h;
            if (i11 >= l81Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.rl0 rl0Var = (org.telegram.ui.Components.rl0) l81Var.getViewPages()[i11];
            if (rl0Var != null) {
                rl0Var.setPadding(0, 0, 0, i10);
            }
            i11++;
        }
    }

    public void setCacheModel(mh.b bVar) {
        this.f = bVar;
        c();
    }

    public void setDelegate(m7 m7Var) {
        this.v = m7Var;
    }
}
