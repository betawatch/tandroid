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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class u7 extends FrameLayout implements org.telegram.ui.Components.nc0 {
    public final ArrayList a;
    public final org.telegram.ui.Components.k81 b;
    public final View c;
    public final org.telegram.ui.ActionBar.p2 d;
    public final ArrayList e;
    public mh.b f;
    public final org.telegram.ui.Components.l81 h;
    public final t7[] n;
    public j7 r;
    public int s;
    public k7 v;

    public u7(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        this.a = new ArrayList();
        this.e = new ArrayList();
        t7[] t7VarArr = new t7[5];
        this.n = t7VarArr;
        this.d = p2Var;
        t7VarArr[0] = new t7(LocaleController.getString(R.string.FilterChats), 0, new l7(this));
        t7VarArr[1] = new t7(LocaleController.getString(R.string.MediaTab), 1, new q7(this));
        t7VarArr[2] = new t7(LocaleController.getString(R.string.SharedFilesTab2), 2, new n7(this));
        t7VarArr[3] = new t7(LocaleController.getString(R.string.Music), 3, new s7(this));
        int i10 = 0;
        while (true) {
            t7[] t7VarArr2 = this.n;
            if (i10 >= t7VarArr2.length) {
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
                l81Var.setAdapter(new g7(this, context, p2Var));
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
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c7
                    public final /* synthetic */ u7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                this.b.v.h1();
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
                w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.c7
                    public final /* synthetic */ u7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                this.b.v.h1();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                return;
            }
            t7 t7Var = t7VarArr2[i10];
            if (t7Var != null) {
                this.e.add(i10, t7Var);
            }
            i10++;
        }
    }

    public static void a(u7 u7Var, o7 o7Var, q7 q7Var, org.telegram.ui.Components.sl0 sl0Var) {
        ArrayList arrayList = q7Var.e;
        PhotoViewer.t1().K2(null, u7Var.d, null);
        if (u7Var.r == null) {
            u7Var.r = new j7(u7Var);
        }
        u7Var.r.a = sl0Var;
        if (arrayList.indexOf(o7Var) >= 0) {
            PhotoViewer.t1().f2(q7Var.r, arrayList.indexOf(o7Var), -1, false, u7Var.r, null);
        }
    }

    public static void b(u7 u7Var, mh.a aVar, m7 m7Var) {
        org.telegram.ui.ActionBar.p2 p2Var = u7Var.d;
        org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) u7Var.h.getCurrentView();
        if (m7Var.e == 2) {
            if (!(sl0Var.getAdapter() instanceof n7)) {
                return;
            }
            PhotoViewer.t1().K2(null, p2Var, null);
            if (u7Var.r == null) {
                u7Var.r = new j7(u7Var);
            }
            u7Var.r.a = sl0Var;
            File file = aVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, aVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().f2(arrayList, 0, -1, false, u7Var.r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, p2Var.getParentActivity(), null, false);
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
        org.telegram.ui.Components.l81 l81Var = this.h;
        if (size == 1 && this.f.a) {
            this.b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) l81Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((t7) arrayList.get(i11)).b == ((t7) arrayList2.get(i11)).b) {
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                h7 h7Var = ((t7) arrayList2.get(i12)).c;
                ((t7) arrayList2.get(i12)).c.F();
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
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.sl0) l81Var.getViewPages()[i10]);
            i10++;
        }
    }

    public org.telegram.ui.Components.sl0 getListView() {
        org.telegram.ui.Components.l81 l81Var = this.h;
        if (l81Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.sl0) l81Var.getCurrentView();
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
            org.telegram.ui.Components.sl0 sl0Var = (org.telegram.ui.Components.sl0) l81Var.getViewPages()[i11];
            if (sl0Var != null) {
                sl0Var.setPadding(0, 0, 0, i10);
            }
            i11++;
        }
    }

    public void setCacheModel(mh.b bVar) {
        this.f = bVar;
        c();
    }

    public void setDelegate(k7 k7Var) {
        this.v = k7Var;
    }
}
