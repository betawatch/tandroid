// default package

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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class w81 extends FrameLayout implements vlb, wk7 {
    public static final /* synthetic */ int H = 0;
    public boolean E;
    public final fb F;
    public l81 G;
    public final ee0 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final vgc d;
    public final d e;
    public final ArrayList f;
    public c81 h;
    public final wgc n;
    public final u81[] r;
    public j81 s;
    public int w;
    public final fja x;
    public int y;

    public w81(Context context, d dVar, sy4 sy4Var, fja fjaVar) {
        super(context);
        this.b = new ArrayList();
        this.f = new ArrayList();
        u81[] u81VarArr = new u81[5];
        this.r = u81VarArr;
        final byte b = 1;
        this.F = new fb(this, b);
        this.e = dVar;
        this.x = fjaVar;
        if (fjaVar != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        u81VarArr[0] = new u81(jb6.M0(2131750733, null), 0, new m81(this));
        u81VarArr[1] = new u81(jb6.M0(2131748408, null), 1, new r81(this));
        u81VarArr[2] = new u81(jb6.M0(2131745148, null), 2, new o81(this));
        u81VarArr[3] = new u81(jb6.M0(2131748076, null), 3, new t81(this));
        int i = 0;
        while (true) {
            u81[] u81VarArr2 = this.r;
            if (i >= u81VarArr2.length) {
                break;
            }
            u81 u81Var = u81VarArr2[i];
            if (u81Var != null) {
                this.f.add(i, u81Var);
            }
            i++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        wgc wgcVar = fjaVar == null ? new wgc(getContext(), null) : new v59(context, dVar.getResourceProvider(), fjaVar);
        this.n = wgcVar;
        wgcVar.setAllowDisallowInterceptTouch(false);
        if (sy4Var != null) {
            sy4Var.c(wgcVar);
        }
        addView(wgcVar, qoe.d(-1, -1.0f, 48, 0.0f, (sy4Var == null && fjaVar == null) ? 48.0f : 0.0f, 0.0f, 0.0f));
        vgc l = wgcVar.l(sy4Var != null ? -2 : 3, true);
        this.d = l;
        frameLayout.addView(l, qoe.c(48.0f, -1));
        if (sy4Var != null) {
            frameLayout.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        }
        addView(frameLayout, qoe.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        wgcVar.setAdapter(new g81(this, context, sy4Var, dVar, fjaVar));
        LinearLayout linearLayout = new LinearLayout(context);
        anb.h(cmb.c6, null, linearLayout);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, qoe.c(48.0f, -1));
        gm.T3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ee0 ee0Var = new ee0(true);
        this.a = ee0Var;
        imageView.setImageDrawable(ee0Var);
        int i2 = cmb.x8;
        ee0Var.a(cmb.w0(null, i2, false));
        int i3 = cmb.y8;
        fg0 f0 = cmb.f0(cmb.w0(null, i3, false), 1, -1);
        wmb M = anb.M(i3);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, null);
        imageView.setContentDescription(jb6.M0(2131751978, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(gm.L(54.0f), -1));
        this.b.add(imageView);
        final byte b2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: d81
            public final /* synthetic */ w81 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                w81 w81Var = this.b;
                switch (b3) {
                    case 0:
                        w81Var.G.v();
                        break;
                    default:
                        w81Var.G.clear();
                        break;
                }
            }
        });
        io ioVar = new io(context, true, true, true);
        ioVar.setTextSize(gm.L(18.0f));
        ioVar.setTypeface(gm.o());
        anb.U(ioVar, i2, null);
        linearLayout.addView(ioVar, qoe.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(ioVar);
        r7 r7Var = new r7(context, null, cmb.w0(null, i3, false), cmb.w0(null, i2, false), false, null);
        r7Var.setIcon(R.drawable.msg_clear);
        if (r7Var.getBackground() != null) {
            Drawable background = r7Var.getBackground();
            wmb M2 = anb.M(i3);
            r7Var.setBackground(background);
            anb.j(r7Var, background, null, M2, null);
        }
        if (r7Var.getIconView() != null) {
            anb.s(r7Var.getIconView(), i2, null, PorterDuff.Mode.SRC_IN);
        }
        r7Var.setContentDescription(jb6.M0(2131751535, null));
        r7Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(r7Var, new LinearLayout.LayoutParams(gm.L(54.0f), -1));
        this.b.add(r7Var);
        r7Var.setOnClickListener(new View.OnClickListener(this) { // from class: d81
            public final /* synthetic */ w81 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                w81 w81Var = this.b;
                switch (b3) {
                    case 0:
                        w81Var.G.v();
                        break;
                    default:
                        w81Var.G.clear();
                        break;
                }
            }
        });
    }

    public final r59 a(View view) {
        if (view == null) {
            return null;
        }
        return view instanceof v81 ? ((v81) view).a : (r59) view;
    }

    public final void b(b81 b81Var, n81 n81Var) {
        r59 listView = getListView();
        if (n81Var.e == 2) {
            if (!(listView.getAdapter() instanceof o81)) {
                return;
            }
            PhotoViewer r0 = PhotoViewer.r0();
            d dVar = this.e;
            r0.T1(null, dVar, null);
            j81 j81Var = this.s;
            if (j81Var == null) {
                j81Var = new j81(this);
                this.s = j81Var;
            }
            j81Var.a = listView;
            File file = b81Var.a;
            File file2 = b81Var.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new jo6(0, file2.getPath(), 0, b81Var.d == 1, 0, 0));
                PhotoViewer.r0().o1(arrayList, 0, -1, false, this.s, null);
            } else {
                gm.s2(file2, file2.getName(), null, dVar.getParentActivity(), null, false);
            }
        }
        if (n81Var.e == 3) {
            if (!MediaController.w().D(b81Var.f)) {
                MediaController.w().R(b81Var.f);
            } else if (MediaController.w().C()) {
                MediaController.w().R(b81Var.f);
            } else {
                MediaController.w().Q(b81Var.f, true);
            }
        }
    }

    public final void c(p81 p81Var, r81 r81Var, r59 r59Var) {
        ArrayList arrayList = r81Var.e;
        PhotoViewer.r0().T1(null, this.e, null);
        j81 j81Var = this.s;
        if (j81Var == null) {
            j81Var = new j81(this);
            this.s = j81Var;
        }
        j81Var.a = r59Var;
        if (arrayList.indexOf(p81Var) >= 0) {
            PhotoViewer.r0().o1(r81Var.r, arrayList.indexOf(p81Var), -1, false, this.s, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8 A[LOOP:2: B:65:0x00f2->B:67:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        if (this.h != null) {
            int i = 0;
            while (true) {
                u81[] u81VarArr = this.r;
                if (i >= u81VarArr.length) {
                    break;
                }
                u81 u81Var = u81VarArr[i];
                if (u81Var != null) {
                    if (u81Var.b == 0 && !this.h.b.isEmpty()) {
                        arrayList2.add(u81VarArr[i]);
                    } else if (u81VarArr[i].b == 1 && !this.h.d.isEmpty()) {
                        arrayList2.add(u81VarArr[i]);
                    } else if (u81VarArr[i].b == 2 && !this.h.e.isEmpty()) {
                        arrayList2.add(u81VarArr[i]);
                    } else if (u81VarArr[i].b == 3 && !this.h.f.isEmpty()) {
                        arrayList2.add(u81VarArr[i]);
                    } else if (u81VarArr[i].b == 5 && !this.h.g.isEmpty()) {
                        arrayList2.add(u81VarArr[i]);
                    } else if (u81VarArr[i].b == 4 && !this.h.h.isEmpty()) {
                        arrayList2.add(u81VarArr[i]);
                    }
                }
                i++;
            }
        }
        int size = arrayList2.size();
        wgc wgcVar = this.n;
        if (size == 1 && this.h.a) {
            this.d.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) wgcVar.getLayoutParams()).topMargin = 0;
        }
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        fja fjaVar = this.x;
        if (size2 == size3) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((u81) arrayList.get(i2)).b == ((u81) arrayList2.get(i2)).b) {
                }
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                h81 h81Var = ((u81) arrayList2.get(i3)).c;
                ((u81) arrayList2.get(i3)).c.F();
            }
            if (fjaVar == null) {
                fjaVar.s();
                return;
            }
            return;
        }
        wgcVar.D(fjaVar == null);
        while (i3 < arrayList2.size()) {
        }
        if (fjaVar == null) {
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            wgc wgcVar = this.n;
            if (i >= wgcVar.getViewPages().length) {
                return;
            }
            r59 a = a(wgcVar.getViewPages()[i]);
            if (a != null) {
                gm.V3(a);
            }
            i++;
        }
    }

    public r59 getListView() {
        return a(this.n.getCurrentView());
    }

    public wgc getViewPager() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.F);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.F);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
    }

    public void setCacheModel(c81 c81Var) {
        this.h = c81Var;
        d();
    }

    public void setDelegate(l81 l81Var) {
        this.G = l81Var;
    }

    public void setTargetTabsPosition(int i) {
        this.y = i;
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.a.a(cmb.w0(null, cmb.x8, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
