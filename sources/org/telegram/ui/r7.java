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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class r7 extends FrameLayout implements org.telegram.ui.Components.ld0 {
    public final ArrayList a;
    public final org.telegram.ui.Components.n91 b;
    public final View c;
    public final org.telegram.ui.ActionBar.n2 d;
    public final ArrayList e;
    public zh.b f;
    public final org.telegram.ui.Components.o91 h;
    public final q7[] n;
    public g7 r;
    public int s;
    public h7 v;

    public r7(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        this.a = new ArrayList();
        this.e = new ArrayList();
        q7[] q7VarArr = new q7[5];
        this.n = q7VarArr;
        this.d = n2Var;
        q7VarArr[0] = new q7(LocaleController.getString(R.string.FilterChats), 0, new i7(this));
        q7VarArr[1] = new q7(LocaleController.getString(R.string.MediaTab), 1, new n7(this));
        q7VarArr[2] = new q7(LocaleController.getString(R.string.SharedFilesTab2), 2, new k7(this));
        q7VarArr[3] = new q7(LocaleController.getString(R.string.Music), 3, new p7(this));
        int i10 = 0;
        while (true) {
            q7[] q7VarArr2 = this.n;
            if (i10 >= q7VarArr2.length) {
                org.telegram.ui.Components.o91 o91Var = new org.telegram.ui.Components.o91(getContext(), null);
                this.h = o91Var;
                o91Var.setAllowDisallowInterceptTouch(false);
                addView(o91Var, w7.x5.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                org.telegram.ui.Components.n91 n10 = o91Var.n(3, true);
                this.b = n10;
                addView(n10, w7.x5.d(48.0f, -1));
                View view = new View(getContext());
                this.c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d7, false));
                addView(view, w7.x5.a(1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                view.getLayoutParams().height = 1;
                o91Var.setAdapter(new d7(this, context, n2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.x5.d(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(true);
                imageView.setImageDrawable(g2Var);
                int i11 = org.telegram.ui.ActionBar.i6.y8;
                g2Var.a(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.i6.z8;
                imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, i12, false), 1, -1));
                imageView.setContentDescription(LocaleController.getString(R.string.Close));
                linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(imageView);
                final int i13 = 0;
                imageView.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z6
                    public final /* synthetic */ r7 b;

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
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, true, true);
                r6Var.setTextSize(AndroidUtilities.dp(18.0f));
                r6Var.setTypeface(AndroidUtilities.bold());
                r6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
                linearLayout.addView(r6Var, w7.x5.m(1.0f, 0, -1, 18, 0, 0));
                this.a.add(r6Var);
                org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, org.telegram.ui.ActionBar.i6.x0(null, i12, false), org.telegram.ui.ActionBar.i6.x0(null, i11, false), false, null);
                v0Var.setIcon(R.drawable.msg_clear);
                v0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                v0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(v0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(v0Var);
                final int i14 = 1;
                v0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.z6
                    public final /* synthetic */ r7 b;

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
            q7 q7Var = q7VarArr2[i10];
            if (q7Var != null) {
                this.e.add(i10, q7Var);
            }
            i10++;
        }
    }

    public static void a(r7 r7Var, l7 l7Var, n7 n7Var, org.telegram.ui.Components.qm0 qm0Var) {
        ArrayList arrayList = n7Var.e;
        PhotoViewer.t1().K2(null, r7Var.d, null);
        if (r7Var.r == null) {
            r7Var.r = new g7(r7Var);
        }
        r7Var.r.a = qm0Var;
        if (arrayList.indexOf(l7Var) >= 0) {
            PhotoViewer.t1().g2(n7Var.r, arrayList.indexOf(l7Var), -1, false, r7Var.r, null);
        }
    }

    public static void b(r7 r7Var, zh.a aVar, j7 j7Var) {
        org.telegram.ui.ActionBar.n2 n2Var = r7Var.d;
        org.telegram.ui.Components.qm0 qm0Var = (org.telegram.ui.Components.qm0) r7Var.h.getCurrentView();
        if (j7Var.e == 2) {
            if (!(qm0Var.getAdapter() instanceof k7)) {
                return;
            }
            PhotoViewer.t1().K2(null, n2Var, null);
            if (r7Var.r == null) {
                r7Var.r = new g7(r7Var);
            }
            r7Var.r.a = qm0Var;
            File file = aVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, aVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().g2(arrayList, 0, -1, false, r7Var.r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, n2Var.getParentActivity(), null, false);
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
            int i10 = 0;
            while (true) {
                q7[] q7VarArr = this.n;
                if (i10 >= q7VarArr.length) {
                    break;
                }
                q7 q7Var = q7VarArr[i10];
                if (q7Var != null) {
                    if (q7Var.b == 0 && !this.f.b.isEmpty()) {
                        arrayList2.add(q7VarArr[i10]);
                    } else if (q7VarArr[i10].b == 1 && !this.f.d.isEmpty()) {
                        arrayList2.add(q7VarArr[i10]);
                    } else if (q7VarArr[i10].b == 2 && !this.f.e.isEmpty()) {
                        arrayList2.add(q7VarArr[i10]);
                    } else if (q7VarArr[i10].b == 3 && !this.f.f.isEmpty()) {
                        arrayList2.add(q7VarArr[i10]);
                    } else if (q7VarArr[i10].b == 5 && !this.f.g.isEmpty()) {
                        arrayList2.add(q7VarArr[i10]);
                    } else if (q7VarArr[i10].b == 4 && !this.f.h.isEmpty()) {
                        arrayList2.add(q7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.o91 o91Var = this.h;
        if (size == 1 && this.f.a) {
            this.b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) o91Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.c.getLayoutParams()).topMargin = 0;
        }
        if (arrayList.size() == arrayList2.size()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((q7) arrayList.get(i11)).b == ((q7) arrayList2.get(i11)).b) {
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                e7 e7Var = ((q7) arrayList2.get(i12)).c;
                ((q7) arrayList2.get(i12)).c.F();
            }
        }
        o91Var.C(true);
        while (i12 < arrayList2.size()) {
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.o91 o91Var = this.h;
            if (i10 >= o91Var.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.qm0) o91Var.getViewPages()[i10]);
            i10++;
        }
    }

    public org.telegram.ui.Components.qm0 getListView() {
        org.telegram.ui.Components.o91 o91Var = this.h;
        if (o91Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.qm0) o91Var.getCurrentView();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public void setBottomPadding(int i10) {
        this.s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.o91 o91Var = this.h;
            if (i11 >= o91Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.qm0 qm0Var = (org.telegram.ui.Components.qm0) o91Var.getViewPages()[i11];
            if (qm0Var != null) {
                qm0Var.setPadding(0, 0, 0, i10);
            }
            i11++;
        }
    }

    public void setCacheModel(zh.b bVar) {
        this.f = bVar;
        c();
    }

    public void setDelegate(h7 h7Var) {
        this.v = h7Var;
    }
}
