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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pv6 extends y59 {
    public final ArrayList c = new ArrayList();
    public final LayoutInflater d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable h;
    public final Drawable n;
    public nv6 r;
    public final int s;
    public final AccelerateDecelerateInterpolator w;
    public final /* synthetic */ rv6 x;

    public pv6(rv6 rv6Var) {
        this.x = rv6Var;
        Context context = rv6Var.E;
        this.d = LayoutInflater.from(context);
        this.e = yqe.d(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f = yqe.d(context, R.attr.mediaRouteTvIconDrawable);
        this.h = yqe.d(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.n = yqe.d(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.s = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.w = new AccelerateDecelerateInterpolator();
        G();
    }

    @Override // y59
    public final void A(u69 u69Var) {
        this.x.M.values().remove(u69Var);
    }

    public final void D(int i, View view) {
        pu6 pu6Var = new pu6(i, view.getLayoutParams().height, view, (byte) 1);
        pu6Var.setAnimationListener(new le(this, (byte) 2));
        pu6Var.setDuration(this.s);
        pu6Var.setInterpolator(this.w);
        view.startAnimation(pu6Var);
    }

    public final Drawable E(ew6 ew6Var) {
        Uri uri = ew6Var.f;
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
        int i = ew6Var.n;
        return i != 1 ? i != 2 ? ew6Var.e() ? this.n : this.e : this.h : this.f;
    }

    public final void F() {
        tv6 tv6Var;
        rv6 rv6Var = this.x;
        ArrayList arrayList = rv6Var.y;
        arrayList.clear();
        ArrayList arrayList2 = rv6Var.w;
        ArrayList arrayList3 = new ArrayList();
        dw6 dw6Var = rv6Var.r.a;
        gw6.b();
        for (ew6 ew6Var : DesugarCollections.unmodifiableList(dw6Var.b)) {
            k44 b = rv6Var.r.b(ew6Var);
            if (b != null && (tv6Var = (tv6) b.b) != null && tv6Var.d) {
                arrayList3.add(ew6Var);
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
        rv6 rv6Var = this.x;
        ArrayList arrayList2 = rv6Var.x;
        Context context = rv6Var.E;
        ArrayList arrayList3 = rv6Var.w;
        this.r = new nv6(rv6Var.r, 1);
        ArrayList arrayList4 = rv6Var.s;
        boolean z = false;
        if (arrayList4.isEmpty()) {
            arrayList.add(new nv6(rv6Var.r, 3));
        } else {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                arrayList.add(new nv6((ew6) obj, 3));
            }
        }
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                ew6 ew6Var = (ew6) obj2;
                if (!arrayList4.contains(ew6Var)) {
                    if (!z2) {
                        rv6Var.r.getClass();
                        uv6 a = ew6.a();
                        String j = a != null ? a.j() : null;
                        if (TextUtils.isEmpty(j)) {
                            j = context.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new nv6(j, 2));
                        z2 = true;
                    }
                    arrayList.add(new nv6(ew6Var, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList2.get(i3);
                i3++;
                ew6 ew6Var2 = (ew6) obj3;
                ew6 ew6Var3 = rv6Var.r;
                if (ew6Var3 != ew6Var2) {
                    if (!z) {
                        ew6Var3.getClass();
                        uv6 a2 = ew6.a();
                        String k = a2 != null ? a2.k() : null;
                        if (TextUtils.isEmpty(k)) {
                            k = context.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new nv6(k, 2));
                        z = true;
                    }
                    arrayList.add(new nv6(ew6Var2, 4));
                }
            }
        }
        F();
    }

    @Override // y59
    public final int b() {
        return this.c.size() + 1;
    }

    @Override // y59
    public final int d(int i) {
        nv6 nv6Var;
        if (i == 0) {
            nv6Var = this.r;
        } else {
            nv6Var = (nv6) this.c.get(i - 1);
        }
        return nv6Var.b;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        k44 b;
        tv6 tv6Var;
        ArrayList arrayList = this.c;
        byte b2 = (i == 0 ? this.r : (nv6) arrayList.get(i - 1)).b;
        boolean z = true;
        nv6 nv6Var = i == 0 ? this.r : (nv6) arrayList.get(i - 1);
        rv6 rv6Var = this.x;
        int i2 = 0;
        if (b2 == 1) {
            rv6Var.M.put(((ew6) nv6Var.a).c, (jv6) u69Var);
            lv6 lv6Var = (lv6) u69Var;
            View view = lv6Var.a;
            rv6 rv6Var2 = lv6Var.B.x;
            if (rv6Var2.j0 && DesugarCollections.unmodifiableList(rv6Var2.r.v).size() > 1) {
                i2 = lv6Var.A;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
            ew6 ew6Var = (ew6) nv6Var.a;
            lv6Var.t(ew6Var);
            lv6Var.z.setText(ew6Var.d);
            return;
        }
        if (b2 == 2) {
            ((mv6) u69Var).v.setText(nv6Var.a.toString());
            return;
        }
        if (b2 != 3) {
            if (b2 != 4) {
                rjb.h();
                return;
            }
            kv6 kv6Var = (kv6) u69Var;
            View view2 = kv6Var.v;
            ew6 ew6Var2 = (ew6) nv6Var.a;
            kv6Var.A = ew6Var2;
            ImageView imageView = kv6Var.w;
            imageView.setVisibility(0);
            kv6Var.x.setVisibility(4);
            pv6 pv6Var = kv6Var.B;
            List unmodifiableList = DesugarCollections.unmodifiableList(pv6Var.x.r.v);
            view2.setAlpha((unmodifiableList.size() == 1 && unmodifiableList.get(0) == ew6Var2) ? kv6Var.z : 1.0f);
            view2.setOnClickListener(new g6(kv6Var, (byte) 11));
            imageView.setImageDrawable(pv6Var.E(ew6Var2));
            kv6Var.y.setText(ew6Var2.d);
            return;
        }
        rv6Var.M.put(((ew6) nv6Var.a).c, (jv6) u69Var);
        ov6 ov6Var = (ov6) u69Var;
        float f = ov6Var.F;
        g6 g6Var = ov6Var.H;
        ImageView imageView2 = ov6Var.A;
        View view3 = ov6Var.z;
        CheckBox checkBox = ov6Var.E;
        ew6 ew6Var3 = (ew6) nv6Var.a;
        pv6 pv6Var2 = ov6Var.I;
        rv6 rv6Var3 = pv6Var2.x;
        if (ew6Var3 == rv6Var3.r && DesugarCollections.unmodifiableList(ew6Var3.v).size() > 0) {
            Iterator it = DesugarCollections.unmodifiableList(ew6Var3.v).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ew6 ew6Var4 = (ew6) it.next();
                if (!rv6Var3.w.contains(ew6Var4)) {
                    ew6Var3 = ew6Var4;
                    break;
                }
            }
        }
        ov6Var.t(ew6Var3);
        imageView2.setImageDrawable(pv6Var2.E(ew6Var3));
        ov6Var.C.setText(ew6Var3.d);
        checkBox.setVisibility(0);
        boolean v = ov6Var.v(ew6Var3);
        boolean z2 = !rv6Var3.y.contains(ew6Var3) && (!ov6Var.v(ew6Var3) || DesugarCollections.unmodifiableList(rv6Var3.r.v).size() >= 2) && (!ov6Var.v(ew6Var3) || ((b = rv6Var3.r.b(ew6Var3)) != null && ((tv6Var = (tv6) b.b) == null || tv6Var.c)));
        checkBox.setChecked(v);
        ov6Var.B.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z2);
        checkBox.setEnabled(z2);
        ov6Var.w.setEnabled(z2 || v);
        MediaRouteVolumeSlider mediaRouteVolumeSlider = ov6Var.x;
        if (!z2 && !v) {
            z = false;
        }
        mediaRouteVolumeSlider.setEnabled(z);
        view3.setOnClickListener(g6Var);
        checkBox.setOnClickListener(g6Var);
        RelativeLayout relativeLayout = ov6Var.D;
        if (v && !ov6Var.v.e()) {
            i2 = ov6Var.G;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i2;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z2 || v) ? 1.0f : f);
        checkBox.setAlpha((z2 || !v) ? 1.0f : f);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.d;
        if (i == 1) {
            return new lv6(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i == 2) {
            return new mv6(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i == 3) {
            return new ov6(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i == 4) {
            return new kv6(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        rjb.h();
        return null;
    }
}
