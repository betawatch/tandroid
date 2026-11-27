// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class wv6 extends ep {
    public static final /* synthetic */ int k0 = 0;
    public final Context E;
    public boolean F;
    public boolean G;
    public long H;
    public final d1 I;
    public RecyclerView J;
    public uv6 K;
    public vv6 L;
    public HashMap M;
    public jw6 N;
    public HashMap O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public ImageButton S;
    public Button T;
    public ImageView U;
    public View V;
    public ImageView W;
    public TextView X;
    public TextView Y;
    public String Z;
    public um4 a0;
    public final yu6 b0;
    public MediaDescriptionCompat c0;
    public nv6 d0;
    public Bitmap e0;
    public final lw6 f;
    public Uri f0;
    public boolean g0;
    public final lu6 h;
    public Bitmap h0;
    public int i0;
    public final boolean j0;
    public dw6 n;
    public jw6 r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final ArrayList y;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wv6(Context context) {
        super(r2, r0 == 0 ? nte.e(r2) : r0);
        ContextThemeWrapper a = nte.a(context, false);
        int g = nte.g(a, R.attr.mediaRouteTheme);
        this.n = dw6.c;
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.I = new d1(this, (byte) 9);
        Context context2 = getContext();
        this.E = context2;
        this.f = lw6.d(context2);
        this.j0 = lw6.g();
        this.h = new lu6(this, (byte) 3);
        this.r = lw6.f();
        this.b0 = new yu6(this, (byte) 1);
        h(lw6.e());
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            jw6 jw6Var = (jw6) list.get(size);
            if (jw6Var.d() || !jw6Var.g || !jw6Var.h(this.n) || this.r == jw6Var) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        Bitmap bitmap;
        Uri uri;
        Uri uri2;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.c0;
        if (mediaDescriptionCompat == null) {
            uri = null;
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.e;
            uri = mediaDescriptionCompat.f;
        }
        nv6 nv6Var = this.d0;
        if (nv6Var == null) {
            bitmap2 = this.e0;
            uri2 = this.f0;
        } else {
            Bitmap bitmap3 = nv6Var.a;
            uri2 = nv6Var.b;
            bitmap2 = bitmap3;
        }
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            nv6 nv6Var2 = this.d0;
            if (nv6Var2 != null) {
                nv6Var2.cancel(true);
            }
            nv6 nv6Var3 = new nv6(this);
            this.d0 = nv6Var3;
            nv6Var3.execute(new Void[0]);
        }
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        um4 um4Var = this.a0;
        yu6 yu6Var = this.b0;
        if (um4Var != null) {
            um4Var.e0(yu6Var);
            this.a0 = null;
        }
        if (mediaSessionCompat$Token == null || !this.G) {
            return;
        }
        um4 um4Var2 = new um4(this.E, mediaSessionCompat$Token);
        this.a0 = um4Var2;
        um4Var2.b0(yu6Var);
        MediaMetadata metadata = ((a) this.a0.b).a.getMetadata();
        if (metadata != null) {
            qs qsVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.b = metadata;
        } else {
            mediaMetadataCompat = null;
        }
        this.c0 = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
        f();
        k();
    }

    public final void i(dw6 dw6Var) {
        if (dw6Var == null) {
            lq5.j("selector must not be null");
            return;
        }
        if (this.n.equals(dw6Var)) {
            return;
        }
        this.n = dw6Var;
        if (this.G) {
            lw6 lw6Var = this.f;
            lu6 lu6Var = this.h;
            lw6Var.h(lu6Var);
            lw6Var.a(dw6Var, lu6Var, 1);
            l();
        }
    }

    public final void j() {
        Context context = this.E;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : mte.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.e0 = null;
        this.f0 = null;
        f();
        k();
        n();
    }

    public final void k() {
        Bitmap bitmap;
        if ((this.N != null || this.P) ? true : !this.F) {
            this.R = true;
            return;
        }
        this.R = false;
        if (!this.r.g() || this.r.d()) {
            dismiss();
        }
        if (!this.g0 || (((bitmap = this.h0) != null && bitmap.isRecycled()) || this.h0 == null)) {
            Bitmap bitmap2 = this.h0;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.h0);
            }
            this.W.setVisibility(8);
            this.V.setVisibility(8);
            this.U.setImageBitmap(null);
        } else {
            this.W.setVisibility(0);
            this.W.setImageBitmap(this.h0);
            this.W.setBackgroundColor(this.i0);
            this.V.setVisibility(0);
            Bitmap bitmap3 = this.h0;
            RenderScript create = RenderScript.create(this.E);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap3);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            Bitmap copy = bitmap3.copy(bitmap3.getConfig(), true);
            createTyped.copyTo(copy);
            createFromBitmap.destroy();
            createTyped.destroy();
            create2.destroy();
            create.destroy();
            this.U.setImageBitmap(copy);
        }
        this.g0 = false;
        this.h0 = null;
        this.i0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.c0;
        CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.c0;
        CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
        boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
        TextView textView = this.X;
        if (isEmpty) {
            textView.setText(this.Z);
        } else {
            textView.setText(charSequence);
        }
        TextView textView2 = this.Y;
        if (isEmpty2) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(charSequence2);
            this.Y.setVisibility(0);
        }
    }

    public final void l() {
        ArrayList arrayList = this.s;
        arrayList.clear();
        ArrayList arrayList2 = this.w;
        arrayList2.clear();
        ArrayList arrayList3 = this.x;
        arrayList3.clear();
        arrayList.addAll(DesugarCollections.unmodifiableList(this.r.v));
        iw6 iw6Var = this.r.a;
        lw6.b();
        for (jw6 jw6Var : DesugarCollections.unmodifiableList(iw6Var.b)) {
            v34 b = this.r.b(jw6Var);
            if (b != null) {
                yv6 yv6Var = (yv6) b.b;
                if (yv6Var != null && yv6Var.d) {
                    arrayList2.add(jw6Var);
                }
                if (yv6Var != null && yv6Var.e) {
                    arrayList3.add(jw6Var);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        nu6 nu6Var = nu6.d;
        Collections.sort(arrayList, nu6Var);
        Collections.sort(arrayList2, nu6Var);
        Collections.sort(arrayList3, nu6Var);
        this.K.G();
    }

    public final void n() {
        if (this.G) {
            if (SystemClock.uptimeMillis() - this.H < 300) {
                d1 d1Var = this.I;
                d1Var.removeMessages(1);
                d1Var.sendEmptyMessageAtTime(1, this.H + 300);
                return;
            }
            if ((this.N != null || this.P) ? true : !this.F) {
                this.Q = true;
                return;
            }
            this.Q = false;
            if (!this.r.g() || this.r.d()) {
                dismiss();
            }
            this.H = SystemClock.uptimeMillis();
            this.K.F();
        }
    }

    public final void o() {
        if (this.Q) {
            n();
        }
        if (this.R) {
            k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        this.f.a(this.n, this.h, 1);
        l();
        h(lw6.e());
    }

    @Override // ep, rq2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.E;
        decorView.setBackgroundColor(context.getColor(nte.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.S = imageButton;
        imageButton.setColorFilter(-1);
        this.S.setOnClickListener(new mv6(this, (byte) 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.T = button;
        button.setTextColor(-1);
        this.T.setOnClickListener(new mv6(this, (byte) 1));
        this.K = new uv6(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.J = recyclerView;
        recyclerView.setAdapter(this.K);
        this.J.setLayoutManager(new x46());
        this.L = new vv6(this);
        this.M = new HashMap();
        this.O = new HashMap();
        this.U = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.V = findViewById(R.id.mr_cast_meta_black_scrim);
        this.W = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.X = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.Y = textView2;
        textView2.setTextColor(-1);
        this.Z = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.F = true;
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        this.f.h(this.h);
        this.I.removeCallbacksAndMessages(null);
        h(null);
    }
}
