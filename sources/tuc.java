// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class tuc extends e {
    public final String[] a;
    public final int[] b;
    public final olc c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f;
    public c51 h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public tuc(ArrayList arrayList, olc olcVar) {
        super(null);
        this.b = new int[3];
        this.d = new ArrayList();
        int i = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            lq5.j("Expected a 12- or 24-word recovery phrase");
            throw null;
        }
        this.c = olcVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.a.length; i2 = qd4.g(i2, i2, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                Arrays.sort(iArr);
                return;
            } else {
                iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                i++;
            }
        }
    }

    public final void Y() {
        if (this.h == null) {
            return;
        }
        ArrayList arrayList = this.d;
        boolean z = false;
        boolean z2 = arrayList.size() == this.b.length;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            z2 &= !((zuc) obj).getWord().isEmpty();
        }
        this.h.setVisibility(z2 ? 0 : 4);
        c51 c51Var = this.h;
        if (z2 && !this.y) {
            z = true;
        }
        c51Var.setEnabled(z);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        final byte b = 0;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        wma wmaVar = new wma(context, null);
        wmaVar.setDelegate(new yv0(this, (byte) 3));
        yob.h(aob.d6, this.resourceProvider, wmaVar);
        this.fragmentView = wmaVar;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        final byte b2 = 1;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, hl.L(96.0f), 0, 0);
        wmaVar.addView(this.e, tre.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(hl.L(36.0f), 0, hl.L(36.0f), hl.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f;
        int i = aob.G6;
        yob.s(imageView2, i, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f.setImageResource(R.drawable.ic_ab_close);
        ImageView imageView3 = this.f;
        int i2 = aob.i6;
        yob.R(imageView3, aob.f0(aob.v0(i2, this.resourceProvider), 3, -1), null, yob.M(i2), this.resourceProvider);
        this.f.setOnClickListener(new View.OnClickListener(this) { // from class: suc
            public final /* synthetic */ tuc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                tuc tucVar = this.b;
                switch (b3) {
                    case 0:
                        tucVar.finishFragment();
                        break;
                    default:
                        int[] iArr = tucVar.b;
                        ArrayList arrayList = tucVar.d;
                        if (!tucVar.y && arrayList.size() == iArr.length) {
                            boolean z = f11.a;
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                if (((zuc) obj).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z2 = true;
                            for (int i4 = 0; i4 < iArr.length; i4++) {
                                zuc zucVar = (zuc) arrayList.get(i4);
                                boolean equalsIgnoreCase = tucVar.a[iArr[i4]].equalsIgnoreCase(zucVar.getWord());
                                if (!equalsIgnoreCase && zucVar.w) {
                                    hl.B3(zucVar);
                                }
                                zucVar.setError(!equalsIgnoreCase);
                                z2 &= equalsIgnoreCase;
                            }
                            if (z2) {
                                tucVar.y = true;
                                tucVar.Y();
                                hl.t1(tucVar.fragmentView);
                                olc olcVar = tucVar.c;
                                if (olcVar != null) {
                                    olcVar.run();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        wmaVar.addView(this.f, tre.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        de0 de0Var = new de0(context);
        de0Var.setAspectFit(true);
        de0Var.getImageReceiver().d = hl.t0();
        ls6.d0(hl.t0()).e2(de0Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        de0Var.getImageReceiver().N(1);
        linearLayout.addView(de0Var, tre.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(1);
        ik8.x(textView, i, this.resourceProvider, null, 2131742636);
        TextView m = ik8.m(linearLayout, textView, tre.t(-1, -2, 1, 32, 0, 32, 10), context);
        m.setTextSize(1, 14.0f);
        m.setGravity(1);
        yob.X(m, aob.z6, this.resourceProvider);
        int[] iArr = this.b;
        uh9.r(null, null, 2131742635, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, m);
        linearLayout.addView(m, tre.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, tre.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList.add(((zuc) obj).getWord());
        }
        arrayList2.clear();
        int i4 = 0;
        while (i4 < iArr.length) {
            zuc zucVar = new zuc(iArr[i4], this.resourceProvider, context, false);
            if (i4 < arrayList.size()) {
                zucVar.setText((String) arrayList.get(i4));
            }
            zucVar.setOnTextChangedListener(new olc(this, (byte) 15));
            zucVar.setOnNextListener(new mpc((Object) this, i4, (Object) zucVar, (byte) 4));
            linearLayout2.addView(zucVar, tre.t(-1, 50, 1, 0, i4 == 0 ? 0 : 12, 0, 0));
            arrayList2.add(zucVar);
            i4++;
        }
        linearLayout.addView(new View(context), tre.l(1.0f, -1, 0));
        c51 c51Var = new c51(this.resourceProvider, context, true);
        this.h = c51Var;
        c51Var.f();
        this.h.setText(ob6.M0(2131742805, null));
        this.h.setOnClickListener(new View.OnClickListener(this) { // from class: suc
            public final /* synthetic */ tuc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                tuc tucVar = this.b;
                switch (b3) {
                    case 0:
                        tucVar.finishFragment();
                        break;
                    default:
                        int[] iArr2 = tucVar.b;
                        ArrayList arrayList3 = tucVar.d;
                        if (!tucVar.y && arrayList3.size() == iArr2.length) {
                            boolean z = f11.a;
                            int size2 = arrayList3.size();
                            int i32 = 0;
                            while (i32 < size2) {
                                Object obj2 = arrayList3.get(i32);
                                i32++;
                                if (((zuc) obj2).getWord().isEmpty()) {
                                    break;
                                }
                            }
                            boolean z2 = true;
                            for (int i42 = 0; i42 < iArr2.length; i42++) {
                                zuc zucVar2 = (zuc) arrayList3.get(i42);
                                boolean equalsIgnoreCase = tucVar.a[iArr2[i42]].equalsIgnoreCase(zucVar2.getWord());
                                if (!equalsIgnoreCase && zucVar2.w) {
                                    hl.B3(zucVar2);
                                }
                                zucVar2.setError(!equalsIgnoreCase);
                                z2 &= equalsIgnoreCase;
                            }
                            if (z2) {
                                tucVar.y = true;
                                tucVar.Y();
                                hl.t1(tucVar.fragmentView);
                                olc olcVar = tucVar.c;
                                if (olcVar != null) {
                                    olcVar.run();
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(this.h, tre.t(-1, 48, 1, 0, 24, 0, 0));
        Y();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.r = i;
        this.s = i2;
        this.w = i3;
        this.x = i4;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i, hl.L(96.0f) + i2, i3, i4 + this.n);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = hl.L(4.0f) + i;
            layoutParams.topMargin = hl.L(12.0f) + i2;
            this.f.setLayoutParams(layoutParams);
        }
    }
}
