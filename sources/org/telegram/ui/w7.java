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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public abstract class w7 extends FrameLayout implements org.telegram.ui.Components.ld0 {
    public final ArrayList a;
    public final org.telegram.ui.Components.k91 b;
    public final View c;
    public final org.telegram.ui.ActionBar.m2 d;
    public final ArrayList e;
    public ai.c f;
    public final org.telegram.ui.Components.l91 h;
    public final v7[] n;
    public l7 r;
    public int s;
    public m7 v;

    public w7(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context);
        this.a = new ArrayList();
        this.e = new ArrayList();
        v7[] v7VarArr = new v7[5];
        this.n = v7VarArr;
        this.d = m2Var;
        v7VarArr[0] = new v7(LocaleController.getString(R.string.FilterChats), 0, new n7(this));
        v7VarArr[1] = new v7(LocaleController.getString(R.string.MediaTab), 1, new s7(this));
        v7VarArr[2] = new v7(LocaleController.getString(R.string.SharedFilesTab2), 2, new p7(this));
        v7VarArr[3] = new v7(LocaleController.getString(R.string.Music), 3, new u7(this));
        int i10 = 0;
        while (true) {
            v7[] v7VarArr2 = this.n;
            if (i10 >= v7VarArr2.length) {
                org.telegram.ui.Components.l91 l91Var = new org.telegram.ui.Components.l91(getContext(), null);
                this.h = l91Var;
                l91Var.setAllowDisallowInterceptTouch(false);
                addView(l91Var, w7.z5.a(-1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                org.telegram.ui.Components.k91 n10 = l91Var.n(3, true);
                this.b = n10;
                addView(n10, w7.z5.d(48.0f, -1));
                View view = new View(getContext());
                this.c = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d7, false));
                addView(view, w7.z5.a(1.0f, 0.0f, 48.0f, 0.0f, 0.0f, -1, 0));
                view.getLayoutParams().height = 1;
                l91Var.setAdapter(new i7(this, context, m2Var));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                linearLayout.setAlpha(0.0f);
                linearLayout.setClickable(true);
                addView(linearLayout, w7.z5.d(48.0f, -1));
                AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(true);
                imageView.setImageDrawable(f2Var);
                int i11 = org.telegram.ui.ActionBar.g6.y8;
                f2Var.a(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                int i12 = org.telegram.ui.ActionBar.g6.z8;
                imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i12, false), 1, -1));
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
                                this.b.v.h1();
                                break;
                            default:
                                this.b.v.clear();
                                break;
                        }
                    }
                });
                org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, true, true);
                s6Var.setTextSize(AndroidUtilities.dp(18.0f));
                s6Var.setTypeface(AndroidUtilities.bold());
                s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
                linearLayout.addView(s6Var, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
                this.a.add(s6Var);
                org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, org.telegram.ui.ActionBar.g6.x0(null, i12, false), org.telegram.ui.ActionBar.g6.x0(null, i11, false), false, null);
                u0Var.setIcon(R.drawable.msg_clear);
                u0Var.setContentDescription(LocaleController.getString(R.string.Delete));
                u0Var.setDuplicateParentStateEnabled(false);
                linearLayout.addView(u0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                this.a.add(u0Var);
                final int i14 = 1;
                u0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.e7
                    public final /* synthetic */ w7 b;

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
            v7 v7Var = v7VarArr2[i10];
            if (v7Var != null) {
                this.e.add(i10, v7Var);
            }
            i10++;
        }
    }

    public static void a(w7 w7Var, q7 q7Var, s7 s7Var, org.telegram.ui.Components.mm0 mm0Var) {
        ArrayList arrayList = s7Var.e;
        PhotoViewer.t1().K2(null, w7Var.d, null);
        if (w7Var.r == null) {
            w7Var.r = new l7(w7Var);
        }
        w7Var.r.a = mm0Var;
        if (arrayList.indexOf(q7Var) >= 0) {
            PhotoViewer.t1().g2(s7Var.r, arrayList.indexOf(q7Var), -1, false, w7Var.r, null);
        }
    }

    public static void b(w7 w7Var, ai.b bVar, o7 o7Var) {
        org.telegram.ui.ActionBar.m2 m2Var = w7Var.d;
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) w7Var.h.getCurrentView();
        if (o7Var.e == 2) {
            if (!(mm0Var.getAdapter() instanceof p7)) {
                return;
            }
            PhotoViewer.t1().K2(null, m2Var, null);
            if (w7Var.r == null) {
                w7Var.r = new l7(w7Var);
            }
            w7Var.r.a = mm0Var;
            File file = bVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, bVar.d == 1, 0, 0, 0L));
                PhotoViewer.t1().g2(arrayList, 0, -1, false, w7Var.r, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, m2Var.getParentActivity(), null, false);
            }
        }
        if (o7Var.e == 3) {
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
        org.telegram.ui.Components.l91 l91Var = this.h;
        if (size == 1 && this.f.a) {
            this.b.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) l91Var.getLayoutParams()).topMargin = 0;
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
        l91Var.C(true);
        while (i12 < arrayList2.size()) {
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.l91 l91Var = this.h;
            if (i10 >= l91Var.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.mm0) l91Var.getViewPages()[i10]);
            i10++;
        }
    }

    public org.telegram.ui.Components.mm0 getListView() {
        org.telegram.ui.Components.l91 l91Var = this.h;
        if (l91Var.getCurrentView() == null) {
            return null;
        }
        return (org.telegram.ui.Components.mm0) l91Var.getCurrentView();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
    }

    public void setBottomPadding(int i10) {
        this.s = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.l91 l91Var = this.h;
            if (i11 >= l91Var.getViewPages().length) {
                return;
            }
            org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) l91Var.getViewPages()[i11];
            if (mm0Var != null) {
                mm0Var.setPadding(0, 0, 0, i10);
            }
            i11++;
        }
    }

    public void setCacheModel(ai.c cVar) {
        this.f = cVar;
        c();
    }

    public void setDelegate(m7 m7Var) {
        this.v = m7Var;
    }
}
