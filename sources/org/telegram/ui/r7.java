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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class r7 extends FrameLayout implements org.telegram.ui.Components.sb0 {
    public final ArrayList a;
    public final org.telegram.ui.Components.m71 b;
    public final View c;
    public final org.telegram.ui.ActionBar.o2 d;
    public final ArrayList e;
    public hh.b f;
    public final org.telegram.ui.Components.n71 h;
    public final q7[] n;
    public g7 r;
    public int s;
    public h7 v;

    public r7(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        this.a = new ArrayList();
        this.e = new ArrayList();
        q7[] q7VarArr = new q7[5];
        this.n = q7VarArr;
        this.d = o2Var;
        q7VarArr[0] = new q7(LocaleController.getString(R.string.FilterChats), 0, new i7(this));
        q7VarArr[1] = new q7(LocaleController.getString(R.string.MediaTab), 1, new n7(this));
        q7VarArr[2] = new q7(LocaleController.getString(R.string.SharedFilesTab2), 2, new k7(this));
        q7VarArr[3] = new q7(LocaleController.getString(R.string.Music), 3, new p7(this));
        int i9 = 0;
        while (true) {
            q7[] q7VarArr2 = this.n;
            if (i9 >= q7VarArr2.length) {
                org.telegram.ui.Components.n71 n71Var = new org.telegram.ui.Components.n71(getContext(), null);
                this.h = n71Var;
                n71Var.setAllowDisallowInterceptTouch(false);
                addView(n71Var, g7.e6.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                org.telegram.ui.Components.m71 n10 = n71Var.n(3, true);
                this.b = n10;
                addView(n10, g7.e6.c(48.0f, -1));
                View view = new View(getContext());
                this.c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d7, false));
                addView(view, g7.e6.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
                view.getLayoutParams().height = 1;
                n71Var.setAdapter(new d7(this, context, o2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, g7.e6.c(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
                imageView.setImageDrawable(h2Var);
                int i10 = org.telegram.ui.ActionBar.f6.y8;
                h2Var.a(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                int i11 = org.telegram.ui.ActionBar.f6.z8;
                imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i11, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(imageView);
                final int i12 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z6
                    public final /* synthetic */ r7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i12) {
                            case 0:
                                this.b.v.H1();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
                j6Var.setTextSize(AndroidUtilities.dp(18.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                linearLayout.addView(j6Var, g7.e6.m(1.0f, 0, -1, 18, 0, 0));
                this.a.add(j6Var);
                org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, org.telegram.ui.ActionBar.f6.w0(null, i11, false), org.telegram.ui.ActionBar.f6.w0(null, i10, false), false, null);
                w0Var.setIcon(R.drawable.msg_clear);
                w0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                w0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(w0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(w0Var);
                final int i13 = 1;
                w0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z6
                    public final /* synthetic */ r7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i13) {
                            case 0:
                                this.b.v.H1();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                return;
            }
            q7 q7Var = q7VarArr2[i9];
            if (q7Var != null) {
                this.e.add(i9, q7Var);
            }
            i9++;
        }
    }

    public static void a(r7 r7Var, l7 l7Var, n7 n7Var, org.telegram.ui.Components.wk0 wk0Var) {
        ArrayList arrayList = n7Var.e;
        PhotoViewer.t1().K2(null, r7Var.d, null);
        if (r7Var.r == null) {
            r7Var.r = new g7(r7Var);
        }
        r7Var.r.a = wk0Var;
        if (arrayList.indexOf(l7Var) >= 0) {
            PhotoViewer.t1().f2(n7Var.r, arrayList.indexOf(l7Var), -1, false, r7Var.r, null);
        }
    }

    public static void b(r7 r7Var, hh.a aVar, j7 j7Var) {
        org.telegram.ui.ActionBar.o2 o2Var = r7Var.d;
        org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) r7Var.h.getCurrentView();
        if (j7Var.e == 2) {
            if (!(wk0Var.getAdapter() instanceof k7)) {
                return;
            }
            PhotoViewer.t1().K2(null, o2Var, null);
            if (r7Var.r == null) {
                r7Var.r = new g7(r7Var);
            }
            r7Var.r.a = wk0Var;
            File file = aVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, aVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().f2(arrayList, 0, -1, false, r7Var.r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, o2Var.getParentActivity(), null, false);
            }
        }
        if (j7Var.e == 3) {
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
            int i9 = 0;
            while (true) {
                q7[] q7VarArr = this.n;
                if (i9 >= q7VarArr.length) {
                    break;
                }
                q7 q7Var = q7VarArr[i9];
                if (q7Var != null) {
                    if (q7Var.b == 0 && !this.f.b.isEmpty()) {
                        arrayList2.add(q7VarArr[i9]);
                    } else if (q7VarArr[i9].b == 1 && !this.f.d.isEmpty()) {
                        arrayList2.add(q7VarArr[i9]);
                    } else if (q7VarArr[i9].b == 2 && !this.f.e.isEmpty()) {
                        arrayList2.add(q7VarArr[i9]);
                    } else if (q7VarArr[i9].b == 3 && !this.f.f.isEmpty()) {
                        arrayList2.add(q7VarArr[i9]);
                    } else if (q7VarArr[i9].b == 5 && !this.f.g.isEmpty()) {
                        arrayList2.add(q7VarArr[i9]);
                    } else if (q7VarArr[i9].b == 4 && !this.f.h.isEmpty()) {
                        arrayList2.add(q7VarArr[i9]);
                    }
                }
                i9++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.n71 n71Var = this.h;
        if (size == 1 && this.f.a) {
            this.b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) n71Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() == arrayList2.size()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (((q7) arrayList.get(i10)).b == ((q7) arrayList2.get(i10)).b) {
                }
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                e7 e7Var = ((q7) arrayList2.get(i11)).c;
                ((q7) arrayList2.get(i11)).c.F();
            }
        }
        n71Var.C(true);
        while (i11 < arrayList2.size()) {
        }
    }

    public final void d() {
        int i9 = 0;
        while (true) {
            org.telegram.ui.Components.n71 n71Var = this.h;
            if (i9 >= n71Var.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.wk0) n71Var.getViewPages()[i9]);
            i9++;
        }
    }

    public org.telegram.ui.Components.wk0 getListView() {
        org.telegram.ui.Components.n71 n71Var = this.h;
        if (n71Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.wk0) n71Var.getCurrentView();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
    }

    public void setBottomPadding(int i9) {
        this.s = i9;
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.n71 n71Var = this.h;
            if (i10 >= n71Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.wk0 wk0Var = (org.telegram.ui.Components.wk0) n71Var.getViewPages()[i10];
            if (wk0Var != null) {
                wk0Var.setPadding(0, 0, 0, i9);
            }
            i10++;
        }
    }

    public void setCacheModel(hh.b bVar) {
        this.f = bVar;
        c();
    }

    public void setDelegate(h7 h7Var) {
        this.v = h7Var;
    }
}
