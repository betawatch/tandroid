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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class v7 extends FrameLayout implements org.telegram.ui.Components.fd0 {
    public final ArrayList a;
    public final org.telegram.ui.Components.c91 b;
    public final View c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final ArrayList e;
    public bi.c f;
    public final org.telegram.ui.Components.d91 h;
    public final u7[] n;
    public k7 r;
    public int s;
    public l7 v;

    public v7(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.a = new ArrayList();
        this.e = new ArrayList();
        u7[] u7VarArr = new u7[5];
        this.n = u7VarArr;
        this.d = n2Var;
        u7VarArr[0] = new u7(LocaleController.getString(R.string.FilterChats), 0, new m7(this));
        u7VarArr[1] = new u7(LocaleController.getString(R.string.MediaTab), 1, new r7(this));
        u7VarArr[2] = new u7(LocaleController.getString(R.string.SharedFilesTab2), 2, new o7(this));
        u7VarArr[3] = new u7(LocaleController.getString(R.string.Music), 3, new t7(this));
        int i10 = 0;
        while (true) {
            u7[] u7VarArr2 = this.n;
            if (i10 >= u7VarArr2.length) {
                org.telegram.ui.Components.d91 d91Var = new org.telegram.ui.Components.d91(getContext(), null);
                this.h = d91Var;
                d91Var.setAllowDisallowInterceptTouch(false);
                addView(d91Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.c91 n10 = d91Var.n(3, true);
                this.b = n10;
                addView(n10, w7.z5.c(48.0f, -1));
                View view = new View(getContext());
                this.c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d7, false));
                addView(view, w7.z5.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                d91Var.setAdapter(new h7(this, context, n2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.z5.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
                imageView.setImageDrawable(g2Var);
                int i11 = org.telegram.ui.ActionBar.h6.y8;
                g2Var.a(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.h6.z8;
                imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(imageView);
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d7
                    public final /* synthetic */ v7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                this.b.v.W0();
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
                q6Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                linearLayout.addView(q6Var, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
                this.a.add(q6Var);
                org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, org.telegram.ui.ActionBar.h6.x0(null, i12, false), org.telegram.ui.ActionBar.h6.x0(null, i11, false), false, null);
                u0Var.setIcon(R.drawable.msg_clear);
                u0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                u0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(u0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(u0Var);
                final int i14 = 1;
                u0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.d7
                    public final /* synthetic */ v7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                this.b.v.W0();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                return;
            }
            u7 u7Var = u7VarArr2[i10];
            if (u7Var != null) {
                this.e.add(i10, u7Var);
            }
            i10++;
        }
    }

    public static void a(v7 v7Var, p7 p7Var, r7 r7Var, org.telegram.ui.Components.im0 im0Var) {
        ArrayList arrayList = r7Var.e;
        PhotoViewer.t1().K2(null, v7Var.d, null);
        if (v7Var.r == null) {
            v7Var.r = new k7(v7Var);
        }
        v7Var.r.a = im0Var;
        if (arrayList.indexOf(p7Var) >= 0) {
            PhotoViewer.t1().g2(r7Var.r, arrayList.indexOf(p7Var), -1, false, v7Var.r, null);
        }
    }

    public static void b(v7 v7Var, bi.b bVar, n7 n7Var) {
        org.telegram.ui.ActionBar.n2 n2Var = v7Var.d;
        org.telegram.ui.Components.im0 im0Var = (org.telegram.ui.Components.im0) v7Var.h.getCurrentView();
        if (n7Var.e == 2) {
            if (!(im0Var.getAdapter() instanceof o7)) {
                return;
            }
            PhotoViewer.t1().K2(null, n2Var, null);
            if (v7Var.r == null) {
                v7Var.r = new k7(v7Var);
            }
            v7Var.r.a = im0Var;
            File file = bVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, bVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().g2(arrayList, 0, -1, false, v7Var.r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, n2Var.getParentActivity(), null, false);
            }
        }
        if (n7Var.e == 3) {
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
                u7[] u7VarArr = this.n;
                if (i10 >= u7VarArr.length) {
                    break;
                }
                u7 u7Var = u7VarArr[i10];
                if (u7Var != null) {
                    if (u7Var.b == 0 && !this.f.b.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    } else if (u7VarArr[i10].b == 1 && !this.f.d.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    } else if (u7VarArr[i10].b == 2 && !this.f.e.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    } else if (u7VarArr[i10].b == 3 && !this.f.f.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    } else if (u7VarArr[i10].b == 5 && !this.f.g.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    } else if (u7VarArr[i10].b == 4 && !this.f.h.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.d91 d91Var = this.h;
        if (size == 1 && this.f.a) {
            this.b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) d91Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((u7) arrayList.get(i11)).b == ((u7) arrayList2.get(i11)).b) {
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                i7 i7Var = ((u7) arrayList2.get(i12)).c;
                ((u7) arrayList2.get(i12)).c.F();
            }
        }
        d91Var.C(true);
        while (i12 < arrayList2.size()) {
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.d91 d91Var = this.h;
            if (i10 >= d91Var.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.im0) d91Var.getViewPages()[i10]);
            i10++;
        }
    }

    public org.telegram.ui.Components.im0 getListView() {
        org.telegram.ui.Components.d91 d91Var = this.h;
        if (d91Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.im0) d91Var.getCurrentView();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public void setBottomPadding(int i10) {
        this.s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.d91 d91Var = this.h;
            if (i11 >= d91Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.im0 im0Var = (org.telegram.ui.Components.im0) d91Var.getViewPages()[i11];
            if (im0Var != null) {
                im0Var.setPadding(0, 0, 0, i10);
            }
            i11++;
        }
    }

    public void setCacheModel(bi.c cVar) {
        this.f = cVar;
        c();
    }

    public void setDelegate(l7 l7Var) {
        this.v = l7Var;
    }
}
