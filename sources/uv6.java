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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class uv6 extends j79 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public sv6 r;
    public final int s;
    public final AccelerateDecelerateInterpolator w;
    public final /* synthetic */ wv6 x;

    public uv6(wv6 wv6Var) {
        this.x = wv6Var;
        Context context = wv6Var.E;
        this.d = LayoutInflater.from(context);
        this.e = nte.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = nte.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = nte.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = nte.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.s = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.w = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override // j79
    public final void A(f89 f89Var) {
        this.x.M.values().remove(f89Var);
    }

    public final void D(int i, View view) {
        uu6 uu6Var = new uu6(i, view.getLayoutParams().height, view, (byte) 1);
        uu6Var.setAnimationListener(new md(this, (byte) 2));
        uu6Var.setDuration(this.s);
        uu6Var.setInterpolator(this.w);
        view.startAnimation(uu6Var);
    }

    public final Drawable E(jw6 jw6Var) {
        Uri uri = jw6Var.f;
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
        int i = jw6Var.n;
        return i != 1 ? i != 2 ? jw6Var.e() ? this.n : this.e : this.h : this.f;
    }

    public final void F() {
        yv6 yv6Var;
        wv6 wv6Var = this.x;
        ArrayList arrayList = wv6Var.y;
        arrayList.clear();
        ArrayList arrayList2 = wv6Var.w;
        ArrayList arrayList3 = new ArrayList();
        iw6 iw6Var = wv6Var.r.a;
        lw6.b();
        for (jw6 jw6Var : DesugarCollections.unmodifiableList(iw6Var.b)) {
            v34 b = wv6Var.r.b(jw6Var);
            if (b != null && (yv6Var = (yv6) b.b) != null && yv6Var.d) {
                arrayList3.add(jw6Var);
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
        wv6 wv6Var = this.x;
        ArrayList arrayList2 = wv6Var.x;
        Context context = wv6Var.E;
        ArrayList arrayList3 = wv6Var.w;
        this.r = new sv6(wv6Var.r, 1);
        ArrayList arrayList4 = wv6Var.s;
        boolean z = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new sv6(wv6Var.r, 3));
        } else {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                arrayList.add(new sv6((jw6) obj, 3));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                jw6 jw6Var = (jw6) obj2;
                if (!arrayList4.contains(jw6Var)) {
                    if (!z2) {
                        wv6Var.r.getClass();
                        zv6 a = jw6.a();
                        String j = a != null ? a.j() : null;
                        if (TextUtils.isEmpty(j)) {
                            j = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new sv6(j, 2));
                        z2 = true;
                    }
                    arrayList.add(new sv6(jw6Var, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                jw6 jw6Var2 = (jw6) obj3;
                jw6 jw6Var3 = wv6Var.r;
                if (jw6Var3 != jw6Var2) {
                    if (!z) {
                        jw6Var3.getClass();
                        zv6 a2 = jw6.a();
                        String k = a2 != null ? a2.k() : null;
                        if (TextUtils.isEmpty(k)) {
                            k = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new sv6(k, 2));
                        z = true;
                    }
                    arrayList.add(new sv6(jw6Var2, 4));
                }
            }
        }
        F();
    }

    @Override // j79
    public final int b() {
        return this.c.size() + 1;
    }

    @Override // j79
    public final int d(int i) {
        sv6 sv6Var;
        if (i == 0) {
            sv6Var = this.r;
        } else {
            sv6Var = (sv6) this.c.get(i - 1);
        }
        return sv6Var.b;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        v34 b;
        yv6 yv6Var;
        ArrayList arrayList = this.c;
        byte b2 = (i == 0 ? this.r : (sv6) arrayList.get(i - 1)).b;
        boolean z = true;
        sv6 sv6Var = i == 0 ? this.r : (sv6) arrayList.get(i - 1);
        wv6 wv6Var = this.x;
        int i2 = 0;
        if (b2 == 1) {
            wv6Var.M.put(((jw6) sv6Var.a).c, (ov6) f89Var);
            qv6 qv6Var = (qv6) f89Var;
            View view = qv6Var.a;
            wv6 wv6Var2 = qv6Var.B.x;
            if (wv6Var2.j0 && DesugarCollections.unmodifiableList(wv6Var2.r.v).size() > 1) {
                i2 = qv6Var.A;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
            jw6 jw6Var = (jw6) sv6Var.a;
            qv6Var.t(jw6Var);
            qv6Var.z.setText(jw6Var.d);
            return;
        }
        if (b2 == 2) {
            ((rv6) f89Var).v.setText(sv6Var.a.toString());
            return;
        }
        if (b2 != 3) {
            if (b2 != 4) {
                grb.g();
                return;
            }
            pv6 pv6Var = (pv6) f89Var;
            View view2 = pv6Var.v;
            jw6 jw6Var2 = (jw6) sv6Var.a;
            pv6Var.A = jw6Var2;
            ImageView imageView = pv6Var.w;
            imageView.setVisibility(0);
            pv6Var.x.setVisibility(4);
            uv6 uv6Var = pv6Var.B;
            List unmodifiableList = DesugarCollections.unmodifiableList(uv6Var.x.r.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == jw6Var2) ? pv6Var.z : 1.0f);
            view2.setOnClickListener(new h6(pv6Var, (byte) 11));
            imageView.setImageDrawable(uv6Var.E(jw6Var2));
            pv6Var.y.setText(jw6Var2.d);
            return;
        }
        wv6Var.M.put(((jw6) sv6Var.a).c, (ov6) f89Var);
        tv6 tv6Var = (tv6) f89Var;
        float f = tv6Var.F;
        h6 h6Var = tv6Var.H;
        ImageView imageView2 = tv6Var.A;
        View view3 = tv6Var.z;
        CheckBox checkBox = tv6Var.E;
        jw6 jw6Var3 = (jw6) sv6Var.a;
        uv6 uv6Var2 = tv6Var.I;
        wv6 wv6Var3 = uv6Var2.x;
        if (jw6Var3 == wv6Var3.r && DesugarCollections.unmodifiableList(jw6Var3.v).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(jw6Var3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                jw6 jw6Var4 = (jw6) it.next();
                if (!wv6Var3.w.contains(jw6Var4)) {
                    jw6Var3 = jw6Var4;
                    break;
                }
            }
        }
        tv6Var.t(jw6Var3);
        imageView2.setImageDrawable(uv6Var2.E(jw6Var3));
        tv6Var.C.setText(jw6Var3.d);
        checkBox.setVisibility(0);
        boolean v = tv6Var.v(jw6Var3);
        boolean z2 = !wv6Var3.y.contains(jw6Var3) && (!tv6Var.v(jw6Var3) || DesugarCollections.unmodifiableList(wv6Var3.r.v).size() >= 2) && (!tv6Var.v(jw6Var3) || ((b = wv6Var3.r.b(jw6Var3)) != null && ((yv6Var = (yv6) b.b) == null || yv6Var.c)));
        checkBox.setChecked(v);
        tv6Var.B.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z2);
        checkBox.setEnabled(z2);
        tv6Var.w.setEnabled(z2 || v);
        MediaRouteVolumeSlider mediaRouteVolumeSlider = tv6Var.x;
        if (!z2 && !v) {
            z = false;
        }
        mediaRouteVolumeSlider.setEnabled(z);
        view3.setOnClickListener(h6Var);
        checkBox.setOnClickListener(h6Var);
        RelativeLayout relativeLayout = tv6Var.D;
        if (v && !tv6Var.v.e()) {
            i2 = tv6Var.G;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i2;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z2 || v) ? 1.0f : f);
        checkBox.setAlpha((z2 || !v) ? 1.0f : f);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i == 1) {
            return new qv6(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new rv6(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new tv6(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i == 4) {
            return new pv6(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        grb.g();
        return null;
    }
}
