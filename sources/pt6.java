// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class pt6 extends w39 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public nt6 r;
    public final int s;
    public final AccelerateDecelerateInterpolator w;
    public final /* synthetic */ rt6 x;

    public pt6(rt6 rt6Var) {
        this.x = rt6Var;
        Context context = rt6Var.E;
        this.d = LayoutInflater.from(context);
        this.e = voe.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = voe.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = voe.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = voe.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.s = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.w = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override // w39
    public final void A(s49 s49Var) {
        this.x.M.values().remove(s49Var);
    }

    public final void D(int i, View view) {
        ps6 ps6Var = new ps6(i, view.getLayoutParams().height, view, (byte) 1);
        ps6Var.setAnimationListener(new ld(this, (byte) 2));
        ps6Var.setDuration(this.s);
        ps6Var.setInterpolator(this.w);
        view.startAnimation(ps6Var);
    }

    public final Drawable E(eu6 eu6Var) {
        Uri uri = eu6Var.f;
        if (uri != null) {
            try {
                Drawable createFromStream = Drawable.createFromStream(this.x.E.getContentResolver().openInputStream(uri), null);
                if (createFromStream != null) {
                    return createFromStream;
                }
            } catch (IOException e) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e);
            }
        }
        int i = eu6Var.n;
        return i != 1 ? i != 2 ? eu6Var.e() ? this.n : this.e : this.h : this.f;
    }

    public final void F() {
        tt6 tt6Var;
        rt6 rt6Var = this.x;
        ArrayList arrayList = rt6Var.y;
        arrayList.clear();
        ArrayList arrayList2 = rt6Var.w;
        ArrayList arrayList3 = new ArrayList();
        du6 du6Var = rt6Var.r.a;
        gu6.b();
        for (eu6 eu6Var : DesugarCollections.unmodifiableList(du6Var.b)) {
            pj4 b = rt6Var.r.b(eu6Var);
            if (b != null && (tt6Var = (tt6) b.b) != null && tt6Var.d) {
                arrayList3.add(eu6Var);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        f();
    }

    public final void G() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        rt6 rt6Var = this.x;
        ArrayList arrayList2 = rt6Var.x;
        Context context = rt6Var.E;
        ArrayList arrayList3 = rt6Var.w;
        this.r = new nt6(rt6Var.r, 1);
        ArrayList arrayList4 = rt6Var.s;
        boolean z = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new nt6(rt6Var.r, 3));
        } else {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                arrayList.add(new nt6((eu6) obj, 3));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                eu6 eu6Var = (eu6) obj2;
                if (!arrayList4.contains(eu6Var)) {
                    if (!z2) {
                        rt6Var.r.getClass();
                        ut6 a = eu6.a();
                        String j = a != null ? a.j() : null;
                        if (TextUtils.isEmpty(j)) {
                            j = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new nt6(j, 2));
                        z2 = true;
                    }
                    arrayList.add(new nt6(eu6Var, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                eu6 eu6Var2 = (eu6) obj3;
                eu6 eu6Var3 = rt6Var.r;
                if (eu6Var3 != eu6Var2) {
                    if (!z) {
                        eu6Var3.getClass();
                        ut6 a2 = eu6.a();
                        String k = a2 != null ? a2.k() : null;
                        if (TextUtils.isEmpty(k)) {
                            k = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new nt6(k, 2));
                        z = true;
                    }
                    arrayList.add(new nt6(eu6Var2, 4));
                }
            }
        }
        F();
    }

    @Override // w39
    public final int b() {
        return this.c.size() + 1;
    }

    @Override // w39
    public final int d(int i) {
        nt6 nt6Var;
        if (i == 0) {
            nt6Var = this.r;
        } else {
            nt6Var = (nt6) this.c.get(i - 1);
        }
        return nt6Var.b;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        pj4 b;
        tt6 tt6Var;
        ArrayList arrayList = this.c;
        byte b2 = (i == 0 ? this.r : (nt6) arrayList.get(i - 1)).b;
        boolean z = true;
        nt6 nt6Var = i == 0 ? this.r : (nt6) arrayList.get(i - 1);
        rt6 rt6Var = this.x;
        int i2 = 0;
        if (b2 == 1) {
            rt6Var.M.put(((eu6) nt6Var.a).c, (jt6) s49Var);
            lt6 lt6Var = (lt6) s49Var;
            View view = lt6Var.a;
            rt6 rt6Var2 = lt6Var.B.x;
            if (rt6Var2.j0 && DesugarCollections.unmodifiableList(rt6Var2.r.v).size() > 1) {
                i2 = lt6Var.A;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
            eu6 eu6Var = (eu6) nt6Var.a;
            lt6Var.t(eu6Var);
            lt6Var.z.setText(eu6Var.d);
            return;
        }
        if (b2 == 2) {
            ((mt6) s49Var).v.setText(nt6Var.a.toString());
            return;
        }
        if (b2 != 3) {
            if (b2 != 4) {
                sdb.a();
                return;
            }
            kt6 kt6Var = (kt6) s49Var;
            View view2 = kt6Var.v;
            eu6 eu6Var2 = (eu6) nt6Var.a;
            kt6Var.A = eu6Var2;
            ImageView imageView = kt6Var.w;
            imageView.setVisibility(0);
            kt6Var.x.setVisibility(4);
            pt6 pt6Var = kt6Var.B;
            List unmodifiableList = DesugarCollections.unmodifiableList(pt6Var.x.r.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == eu6Var2) ? kt6Var.z : 1.0f);
            view2.setOnClickListener(new g6(kt6Var, (byte) 11));
            imageView.setImageDrawable(pt6Var.E(eu6Var2));
            kt6Var.y.setText(eu6Var2.d);
            return;
        }
        rt6Var.M.put(((eu6) nt6Var.a).c, (jt6) s49Var);
        ot6 ot6Var = (ot6) s49Var;
        float f = ot6Var.F;
        g6 g6Var = ot6Var.H;
        ImageView imageView2 = ot6Var.A;
        View view3 = ot6Var.z;
        CheckBox checkBox = ot6Var.E;
        eu6 eu6Var3 = (eu6) nt6Var.a;
        pt6 pt6Var2 = ot6Var.I;
        rt6 rt6Var3 = pt6Var2.x;
        if (eu6Var3 == rt6Var3.r && DesugarCollections.unmodifiableList(eu6Var3.v).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(eu6Var3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                eu6 eu6Var4 = (eu6) it.next();
                if (!rt6Var3.w.contains(eu6Var4)) {
                    eu6Var3 = eu6Var4;
                    break;
                }
            }
        }
        ot6Var.t(eu6Var3);
        imageView2.setImageDrawable(pt6Var2.E(eu6Var3));
        ot6Var.C.setText(eu6Var3.d);
        checkBox.setVisibility(0);
        boolean v = ot6Var.v(eu6Var3);
        boolean z2 = !rt6Var3.y.contains(eu6Var3) && (!ot6Var.v(eu6Var3) || DesugarCollections.unmodifiableList(rt6Var3.r.v).size() >= 2) && (!ot6Var.v(eu6Var3) || ((b = rt6Var3.r.b(eu6Var3)) != null && ((tt6Var = (tt6) b.b) == null || tt6Var.c)));
        checkBox.setChecked(v);
        ot6Var.B.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z2);
        checkBox.setEnabled(z2);
        ot6Var.w.setEnabled(z2 || v);
        MediaRouteVolumeSlider mediaRouteVolumeSlider = ot6Var.x;
        if (!z2 && !v) {
            z = false;
        }
        mediaRouteVolumeSlider.setEnabled(z);
        view3.setOnClickListener(g6Var);
        checkBox.setOnClickListener(g6Var);
        RelativeLayout relativeLayout = ot6Var.D;
        if (v && !ot6Var.v.e()) {
            i2 = ot6Var.G;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i2;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z2 || v) ? 1.0f : f);
        checkBox.setAlpha((z2 || !v) ? 1.0f : f);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i == 1) {
            return new lt6(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new mt6(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new ot6(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i == 4) {
            return new kt6(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        sdb.a();
        return null;
    }
}
