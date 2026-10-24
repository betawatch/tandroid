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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class v7 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.ui.Components.hd0 {
    public final org.telegram.ui.ActionBar.h2 a;
    public final ArrayList b;
    public final org.telegram.ui.Components.k91 c;
    public final View d;
    public final org.telegram.ui.ActionBar.o2 e;
    public final ArrayList f;
    public bi.c h;
    public final org.telegram.ui.Components.l91 n;
    public final u7[] r;
    public k7 s;
    public int v;
    public l7 w;

    public v7(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        this.b = new ArrayList();
        this.f = new ArrayList();
        u7[] u7VarArr = new u7[5];
        this.r = u7VarArr;
        this.e = o2Var;
        u7VarArr[0] = new u7(LocaleController.getString(R.string.FilterChats), 0, new m7(this));
        u7VarArr[1] = new u7(LocaleController.getString(R.string.MediaTab), 1, new r7(this));
        u7VarArr[2] = new u7(LocaleController.getString(R.string.SharedFilesTab2), 2, new o7(this));
        u7VarArr[3] = new u7(LocaleController.getString(R.string.Music), 3, new t7(this));
        int i10 = 0;
        while (true) {
            u7[] u7VarArr2 = this.r;
            if (i10 >= u7VarArr2.length) {
                break;
            }
            u7 u7Var = u7VarArr2[i10];
            if (u7Var != null) {
                this.f.add(i10, u7Var);
            }
            i10++;
        }
        org.telegram.ui.Components.l91 l91Var = new org.telegram.ui.Components.l91(getContext(), null);
        this.n = l91Var;
        l91Var.setAllowDisallowInterceptTouch(false);
        addView(l91Var, w7.z5.d(-1, -1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k91 n10 = l91Var.n(3, true);
        this.c = n10;
        addView(n10, w7.z5.c(48.0f, -1));
        View view = new View(getContext());
        this.d = view;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d7, view, null);
        addView(view, w7.z5.d(-1, 1.0f, 0, 0.0f, 48.0f, 0.0f, 0.0f));
        view.getLayoutParams().height = 1;
        l91Var.setAdapter(new h7(this, context, o2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, linearLayout, null);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, w7.z5.c(48.0f, -1));
        AndroidUtilities.updateViewVisibilityAnimated(linearLayout, false, 1.0f, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(true);
        this.a = h2Var;
        imageView.setImageDrawable(h2Var);
        int i11 = org.telegram.ui.ActionBar.k6.y8;
        h2Var.a(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        int i12 = org.telegram.ui.ActionBar.k6.z8;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.r6.k(imageView, g02, null, O, null);
        imageView.setContentDescription(LocaleController.getString(R.string.Close));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.b.add(imageView);
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
                        this.b.w.W0();
                        break;
                    default:
                        this.b.w.clear();
                        break;
                }
            }
        });
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, true, true, true);
        q6Var.setTextSize(AndroidUtilities.dp(18.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.r6.a0(q6Var, i11, null);
        linearLayout.addView(q6Var, w7.z5.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(q6Var);
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, org.telegram.ui.ActionBar.k6.x0(null, i12, false), org.telegram.ui.ActionBar.k6.x0(null, i11, false), false, null);
        u0Var.setIcon(R.drawable.msg_clear);
        if (u0Var.getBackground() != null) {
            Drawable background = u0Var.getBackground();
            org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
            u0Var.setBackground(background);
            org.telegram.ui.ActionBar.r6.k(u0Var, background, null, O2, null);
        }
        if (u0Var.getIconView() != null) {
            org.telegram.ui.ActionBar.r6.t(u0Var.getIconView(), i11, null, PorterDuff.Mode.SRC_IN);
        }
        u0Var.setContentDescription(LocaleController.getString(R.string.Delete));
        u0Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(u0Var, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.b.add(u0Var);
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
                        this.b.w.W0();
                        break;
                    default:
                        this.b.w.clear();
                        break;
                }
            }
        });
    }

    public static void a(v7 v7Var, p7 p7Var, r7 r7Var, org.telegram.ui.Components.mm0 mm0Var) {
        ArrayList arrayList = r7Var.e;
        PhotoViewer.u1().M2(null, v7Var.e, null);
        if (v7Var.s == null) {
            v7Var.s = new k7(v7Var);
        }
        v7Var.s.a = mm0Var;
        if (arrayList.indexOf(p7Var) >= 0) {
            PhotoViewer.u1().i2(r7Var.r, arrayList.indexOf(p7Var), -1, false, v7Var.s, null);
        }
    }

    public static void b(v7 v7Var, bi.b bVar, n7 n7Var) {
        org.telegram.ui.ActionBar.o2 o2Var = v7Var.e;
        org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) v7Var.n.getCurrentView();
        if (n7Var.e == 2) {
            if (!(mm0Var.getAdapter() instanceof o7)) {
                return;
            }
            PhotoViewer.u1().M2(null, o2Var, null);
            if (v7Var.s == null) {
                v7Var.s = new k7(v7Var);
            }
            v7Var.s.a = mm0Var;
            File file = bVar.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, file.getPath(), 0, bVar.d == 1, 0, 0, 0L));
                PhotoViewer.u1().i2(arrayList, 0, -1, false, v7Var.s, null);
            } else {
                AndroidUtilities.openForView(file, file.getName(), null, o2Var.getParentActivity(), null, false);
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
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.h != null) {
            int i10 = 0;
            while (true) {
                u7[] u7VarArr = this.r;
                if (i10 >= u7VarArr.length) {
                    break;
                }
                u7 u7Var = u7VarArr[i10];
                if (u7Var != null) {
                    if (u7Var.b == 0 && !this.h.b.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    } else if (u7VarArr[i10].b == 1 && !this.h.d.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    } else if (u7VarArr[i10].b == 2 && !this.h.e.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    } else if (u7VarArr[i10].b == 3 && !this.h.f.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    } else if (u7VarArr[i10].b == 5 && !this.h.g.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    } else if (u7VarArr[i10].b == 4 && !this.h.h.isEmpty()) {
                        arrayList2.add(u7VarArr[i10]);
                    }
                }
                i10++;
            }
        }
        int size = arrayList2.size();
        org.telegram.ui.Components.l91 l91Var = this.n;
        if (size == 1 && this.h.a) {
            this.c.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) l91Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = 0;
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
        l91Var.C(true);
        while (i12 < arrayList2.size()) {
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.l91 l91Var = this.n;
            if (i10 >= l91Var.getViewPages().length) {
                return;
            }
            AndroidUtilities.updateVisibleRows((org.telegram.ui.Components.mm0) l91Var.getViewPages()[i10]);
            i10++;
        }
    }

    public org.telegram.ui.Components.mm0 getListView() {
        org.telegram.ui.Components.l91 l91Var = this.n;
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
        this.v = i10;
        int i11 = 0;
        while (true) {
            org.telegram.ui.Components.l91 l91Var = this.n;
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

    public void setCacheModel(bi.c cVar) {
        this.h = cVar;
        c();
    }

    public void setDelegate(l7 l7Var) {
        this.w = l7Var;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.a.a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y8, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
