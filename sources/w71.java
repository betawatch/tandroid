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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class w71 extends FrameLayout implements snb, dl7 {
    public static final /* synthetic */ int H = 0;
    public boolean E;
    public final gb F;
    public l71 G;
    public final gd0 a;
    public final ArrayList b;
    public final FrameLayout c;
    public final uic d;
    public final e e;
    public final ArrayList f;
    public d71 h;
    public final vic n;
    public final u71[] r;
    public k71 s;
    public int w;
    public final wka x;
    public int y;

    public w71(Context context, e eVar, vy4 vy4Var, wka wkaVar) {
        super(context);
        this.b = new ArrayList();
        this.f = new ArrayList();
        u71[] u71VarArr = new u71[5];
        this.r = u71VarArr;
        final byte b = 1;
        this.F = new gb(this, b);
        this.e = eVar;
        this.x = wkaVar;
        if (wkaVar != null) {
            setClipChildren(false);
            setClipToPadding(false);
        }
        u71VarArr[0] = new u71(ob6.M0(2131750761, null), 0, new m71(this));
        u71VarArr[1] = new u71(ob6.M0(2131748405, null), 1, new r71(this));
        u71VarArr[2] = new u71(ob6.M0(2131745142, null), 2, new o71(this));
        u71VarArr[3] = new u71(ob6.M0(2131748073, null), 3, new t71(this));
        int i = 0;
        while (true) {
            u71[] u71VarArr2 = this.r;
            if (i >= u71VarArr2.length) {
                break;
            }
            u71 u71Var = u71VarArr2[i];
            if (u71Var != null) {
                this.f.add(i, u71Var);
            }
            i++;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        vic vicVar = wkaVar == null ? new vic(getContext(), null) : new h79(context, eVar.getResourceProvider(), wkaVar);
        this.n = vicVar;
        vicVar.setAllowDisallowInterceptTouch(false);
        if (vy4Var != null) {
            vy4Var.c(vicVar);
        }
        addView(vicVar, tre.d(-1, -1.0f, 48, 0.0f, (vy4Var == null && wkaVar == null) ? 48.0f : 0.0f, 0.0f, 0.0f));
        uic l = vicVar.l(vy4Var != null ? -2 : 3, true);
        this.d = l;
        frameLayout.addView(l, tre.c(48.0f, -1));
        if (vy4Var != null) {
            frameLayout.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        }
        addView(frameLayout, tre.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
        vicVar.setAdapter(new h71(this, context, vy4Var, eVar, wkaVar));
        LinearLayout linearLayout = new LinearLayout(context);
        yob.h(aob.d6, null, linearLayout);
        linearLayout.setAlpha(0.0f);
        linearLayout.setClickable(true);
        addView(linearLayout, tre.c(48.0f, -1));
        hl.T3(linearLayout, false, 1.0f, true, false);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        gd0 gd0Var = new gd0(true);
        this.a = gd0Var;
        imageView.setImageDrawable(gd0Var);
        int i2 = aob.y8;
        gd0Var.a(aob.w0(null, i2, false));
        int i3 = aob.z8;
        hf0 f0 = aob.f0(aob.w0(null, i3, false), 1, -1);
        uob M = yob.M(i3);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        imageView.setContentDescription(ob6.M0(2131752006, null));
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(hl.L(54.0f), -1));
        this.b.add(imageView);
        final byte b2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: e71
            public final /* synthetic */ w71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                w71 w71Var = this.b;
                switch (b3) {
                    case 0:
                        w71Var.G.v();
                        break;
                    default:
                        w71Var.G.clear();
                        break;
                }
            }
        });
        in inVar = new in(context, true, true, true);
        inVar.setTextSize(hl.L(18.0f));
        inVar.setTypeface(hl.o());
        yob.U(inVar, i2, null);
        linearLayout.addView(inVar, tre.m(1.0f, 0, -1, 18, 0, 0));
        this.b.add(inVar);
        s7 s7Var = new s7(context, null, aob.w0(null, i3, false), aob.w0(null, i2, false), false, null);
        s7Var.setIcon(R.drawable.msg_clear);
        if (s7Var.getBackground() != null) {
            Drawable background = s7Var.getBackground();
            uob M2 = yob.M(i3);
            s7Var.setBackground(background);
            yob.j(s7Var, background, null, M2, null);
        }
        if (s7Var.getIconView() != null) {
            yob.s(s7Var.getIconView(), i2, null, PorterDuff.Mode.SRC_IN);
        }
        s7Var.setContentDescription(ob6.M0(2131751563, null));
        s7Var.setDuplicateParentStateEnabled(false);
        linearLayout.addView(s7Var, new LinearLayout.LayoutParams(hl.L(54.0f), -1));
        this.b.add(s7Var);
        s7Var.setOnClickListener(new View.OnClickListener(this) { // from class: e71
            public final /* synthetic */ w71 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                w71 w71Var = this.b;
                switch (b3) {
                    case 0:
                        w71Var.G.v();
                        break;
                    default:
                        w71Var.G.clear();
                        break;
                }
            }
        });
    }

    public final d79 a(View view) {
        if (view == null) {
            return null;
        }
        return view instanceof v71 ? ((v71) view).a : (d79) view;
    }

    public final void b(c71 c71Var, n71 n71Var) {
        d79 listView = getListView();
        if (n71Var.e == 2) {
            if (!(listView.getAdapter() instanceof o71)) {
                return;
            }
            PhotoViewer q0 = PhotoViewer.q0();
            e eVar = this.e;
            q0.T1(null, eVar, null);
            k71 k71Var = this.s;
            if (k71Var == null) {
                k71Var = new k71(this);
                this.s = k71Var;
            }
            k71Var.a = listView;
            File file = c71Var.a;
            File file2 = c71Var.a;
            String lowerCase = file.getName().toLowerCase();
            if (file.getName().endsWith("mp4") || file.getName().endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".png") || lowerCase.endsWith(".gif")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new no6(0, file2.getPath(), 0, c71Var.d == 1, 0, 0));
                PhotoViewer.q0().o1(arrayList, 0, -1, false, this.s, null);
            } else {
                hl.s2(file2, file2.getName(), null, eVar.getParentActivity(), null, false);
            }
        }
        if (n71Var.e == 3) {
            if (!MediaController.z().H(c71Var.f)) {
                MediaController.z().V(c71Var.f);
            } else if (MediaController.z().G()) {
                MediaController.z().V(c71Var.f);
            } else {
                MediaController.z().U(c71Var.f, true);
            }
        }
    }

    public final void c(p71 p71Var, r71 r71Var, d79 d79Var) {
        ArrayList arrayList = r71Var.e;
        PhotoViewer.q0().T1(null, this.e, null);
        k71 k71Var = this.s;
        if (k71Var == null) {
            k71Var = new k71(this);
            this.s = k71Var;
        }
        k71Var.a = d79Var;
        if (arrayList.indexOf(p71Var) >= 0) {
            PhotoViewer.q0().o1(r71Var.r, arrayList.indexOf(p71Var), -1, false, this.s, null);
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
                u71[] u71VarArr = this.r;
                if (i >= u71VarArr.length) {
                    break;
                }
                u71 u71Var = u71VarArr[i];
                if (u71Var != null) {
                    if (u71Var.b == 0 && !this.h.b.isEmpty()) {
                        arrayList2.add(u71VarArr[i]);
                    } else if (u71VarArr[i].b == 1 && !this.h.d.isEmpty()) {
                        arrayList2.add(u71VarArr[i]);
                    } else if (u71VarArr[i].b == 2 && !this.h.e.isEmpty()) {
                        arrayList2.add(u71VarArr[i]);
                    } else if (u71VarArr[i].b == 3 && !this.h.f.isEmpty()) {
                        arrayList2.add(u71VarArr[i]);
                    } else if (u71VarArr[i].b == 5 && !this.h.g.isEmpty()) {
                        arrayList2.add(u71VarArr[i]);
                    } else if (u71VarArr[i].b == 4 && !this.h.h.isEmpty()) {
                        arrayList2.add(u71VarArr[i]);
                    }
                }
                i++;
            }
        }
        int size = arrayList2.size();
        vic vicVar = this.n;
        if (size == 1 && this.h.a) {
            this.d.setVisibility(8);
            ((ViewGroup.MarginLayoutParams) vicVar.getLayoutParams()).topMargin = 0;
        }
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        wka wkaVar = this.x;
        if (size2 == size3) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((u71) arrayList.get(i2)).b == ((u71) arrayList2.get(i2)).b) {
                }
            }
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                i71 i71Var = ((u71) arrayList2.get(i3)).c;
                ((u71) arrayList2.get(i3)).c.F();
            }
            if (wkaVar == null) {
                wkaVar.s();
                return;
            }
            return;
        }
        vicVar.E(wkaVar == null);
        while (i3 < arrayList2.size()) {
        }
        if (wkaVar == null) {
        }
    }

    public final void e() {
        int i = 0;
        while (true) {
            vic vicVar = this.n;
            if (i >= vicVar.getViewPages().length) {
                return;
            }
            d79 a = a(vicVar.getViewPages()[i]);
            if (a != null) {
                hl.V3(a);
            }
            i++;
        }
    }

    public d79 getListView() {
        return a(this.n.getCurrentView());
    }

    public vic getViewPager() {
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

    public void setCacheModel(d71 d71Var) {
        this.h = d71Var;
        d();
    }

    public void setDelegate(l71 l71Var) {
        this.G = l71Var;
    }

    public void setTargetTabsPosition(int i) {
        this.y = i;
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.a.a(aob.w0(null, aob.y8, false));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
