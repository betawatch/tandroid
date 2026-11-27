// default package

import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class zn8 extends FrameLayout implements VoIPService.StateListener {
    public final boolean E;
    public boolean a;
    public final fic b;
    public final u8 c;
    public final LinearLayout d;
    public final e29 e;
    public final TextView[] f;
    public final hmc h;
    public byte n;
    public byte r;
    public boolean s;
    public boolean w;
    public float x;
    public int y;

    public zn8(LaunchActivity launchActivity, boolean z) {
        super(launchActivity);
        this.n = (byte) 1;
        this.r = (byte) 1;
        this.E = z;
        byte b = 3;
        byte b2 = 2;
        this.f = new TextView[z ? 3 : 2];
        fic ficVar = new fic(launchActivity);
        this.b = ficVar;
        hl.w3(ficVar, 2130706432);
        ficVar.setAdapter(new gb5(this, b));
        ficVar.setPageMargin(0);
        ficVar.setOffscreenPageLimit(1);
        addView(ficVar, tre.c(-1.0f, -1));
        ficVar.b(new xn8(this));
        hmc hmcVar = new hmc(launchActivity, false, false);
        this.h = hmcVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        gmc gmcVar = hmcVar.d;
        gmcVar.setScalingType(scalingType);
        hmcVar.b0 = (byte) 1;
        hmcVar.d0 = true;
        gmcVar.setAlpha(0.0f);
        gmcVar.setRotateTextureWithScreen(true);
        gmcVar.setUseCameraRotation(true);
        addView(hmcVar, tre.c(-1.0f, -1));
        a aVar = new a(launchActivity, null);
        aVar.setBackButtonDrawable(new gd0(false));
        aVar.setBackgroundColor(0);
        yob.l(aVar, 1, aob.Yg, null);
        aVar.setOccupyStatusBar(true);
        aVar.setActionBarMenuOnItemClick(new rn8(this, b2));
        addView(aVar);
        u8 u8Var = new u8(this, getContext());
        this.c = u8Var;
        u8Var.setMinWidth(hl.L(64.0f));
        u8Var.setTag(-1);
        u8Var.setTextSize(1, 14.0f);
        int i = aob.eh;
        yob.X(u8Var, i, null);
        byte b3 = 17;
        u8Var.setGravity(17);
        u8Var.setTypeface(hl.o());
        u8Var.setText(ob6.M0(2131742892, null));
        int L = hl.L(6.0f);
        int o = vm2.o(aob.w0(null, i, false), 76);
        u8Var.setForeground(aob.i0(L, L, L, L, 0, o, o));
        u8Var.setPadding(0, hl.L(12.0f), 0, hl.L(12.0f));
        u8Var.setOnClickListener(new jn8(this, b2));
        addView(u8Var, tre.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(launchActivity);
        this.d = linearLayout;
        addView(linearLayout, tre.e(-2, 64, 80));
        int i2 = 0;
        while (true) {
            TextView[] textViewArr = this.f;
            if (i2 >= textViewArr.length) {
                break;
            }
            textViewArr[i2] = new TextView(launchActivity);
            this.f[i2].setTextSize(1, 12.0f);
            this.f[i2].setTextColor(-1);
            this.f[i2].setTypeface(hl.o());
            this.f[i2].setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
            this.f[i2].setGravity(16);
            this.f[i2].setSingleLine(true);
            this.d.addView(this.f[i2], tre.o(-2, -1));
            if (i2 == 0) {
                if (this.E) {
                    this.f[i2].setText(ob6.M0(2131742911, null));
                }
                this.f[i2].setText(ob6.M0(2131743057, null));
            } else {
                if (i2 != 1 || !this.E) {
                    this.f[i2].setText(ob6.M0(2131743145, null));
                }
                this.f[i2].setText(ob6.M0(2131743057, null));
            }
            this.f[i2].setOnClickListener(new w0(this, i2, b3));
            i2++;
        }
        setAlpha(0.0f);
        setTranslationX(hl.L(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.b(VideoCapturerDevice.getEglBase().getEglBaseContext(), new yn8());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.b.setCurrentItem(this.E ? 1 : 0);
        e29 e29Var = new e29(launchActivity);
        this.e = e29Var;
        e29Var.setPadding(hl.L(9.0f), hl.L(9.0f), hl.L(9.0f), hl.L(9.0f));
        e29Var.setBackground(aob.K(hl.L(48.0f), vm2.o(-16777216, 76)));
        b29 b29Var = new b29(R.raw.voice_mini, hl.L(24.0f), hl.L(24.0f), true, null);
        e29Var.setAnimation(b29Var);
        e29Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.w = true;
        b29Var.H(69);
        e29Var.setOnClickListener(new uv5(this, b29Var, (byte) 25));
        addView(e29Var, tre.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public final void a(boolean z, boolean z2) {
        if (this.a) {
            return;
        }
        this.a = true;
        c();
        j95 j95Var = ((c85) this).F;
        boolean z3 = j95Var.t2.w;
        j95Var.t2 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z2) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z, z3);
            }
            if (z && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            j95Var.M1(true, false);
            j95Var.T2.B();
            j95Var.E0(true);
            j95Var.o1.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(hl.L(32.0f)).setDuration(150L).setListener(new n88(this, (byte) 18));
        invalidate();
    }

    public final void b() {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (this.n == this.r || sharedInstance == null) {
            return;
        }
        boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        byte b = this.n;
        if ((b == 1 && !isFrontFaceCamera) || (b == 2 && isFrontFaceCamera)) {
            c();
            this.s = false;
            VoIPService.getSharedInstance().switchCamera();
            this.h.setAlpha(0.0f);
        }
        this.r = this.n;
    }

    public final void c() {
        hmc hmcVar = this.h;
        if (this.s) {
            try {
                Bitmap bitmap = hmcVar.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), hmcVar.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(org.telegram.messenger.a.h(), "cthumb" + ((int) this.r) + ".jpg")));
                        View findViewWithTag = this.b.findViewWithTag(Integer.valueOf(this.r - (!this.E ? 1 : 0)));
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        int i = this.y;
        TextView[] textViewArr = this.f;
        TextView textView = textViewArr[i];
        TextView textView2 = i < textViewArr.length + (-1) ? textViewArr[i + 1] : null;
        getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * this.x;
        }
        for (int i2 = 0; i2 < textViewArr.length; i2++) {
            int i3 = this.y;
            float f = 0.9f;
            float f2 = 0.7f;
            if (i2 >= i3 && i2 <= i3 + 1) {
                float f3 = this.x;
                float f4 = 0.3f * f3;
                if (i2 == i3) {
                    f2 = 1.0f - f4;
                    f = 1.0f - (f3 * 0.1f);
                } else {
                    f2 = 0.7f + f4;
                    f = 0.9f + (f3 * 0.1f);
                }
            }
            textViewArr[i2].setAlpha(f2);
            textViewArr[i2].setScaleX(f);
            textViewArr[i2].setScaleY(f);
        }
        this.d.setTranslationX(measuredWidth2);
        this.c.invalidate();
        boolean z = this.E;
        hmc hmcVar = this.h;
        if (z && this.y == 0 && this.x <= 0.0f) {
            hmcVar.setVisibility(4);
            return;
        }
        hmcVar.setVisibility(0);
        int i4 = this.y + (!z ? 1 : 0);
        byte b = this.n;
        float f5 = this.x;
        if (i4 == b) {
            hmcVar.setTranslationX((-f5) * getMeasuredWidth());
        } else {
            hmcVar.setTranslationX((1.0f - f5) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return vm2.o(aob.w0(null, aob.Xg, false), (int) (getAlpha() * 1.0f * 255.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
        if (this.s) {
            return;
        }
        this.s = true;
        this.h.animate().alpha(1.0f).setDuration(250L);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z) {
        if (VoIPService.getSharedInstance() != null) {
            this.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        if (z) {
            int L = hl.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = hl.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        e29 e29Var = this.e;
        if (e29Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) e29Var.getLayoutParams();
            if (z) {
                int L3 = hl.L(88.0f);
                marginLayoutParams2.leftMargin = L3;
                marginLayoutParams2.rightMargin = L3;
            } else {
                int L4 = hl.L(24.0f);
                marginLayoutParams2.leftMargin = L4;
                marginLayoutParams2.rightMargin = L4;
            }
        }
        super.onMeasure(i, i2);
        measureChildWithMargins(this.d, 0, 0, View.MeasureSpec.makeMeasureSpec(hl.L(64.0f), TLObject.FLAG_30), 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setBottomPadding(int i) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = hl.L(64.0f) + i;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = hl.L(136.0f) + i;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onAudioSettingsChanged() {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onScreenOnChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onSignalBarsCountChanged(int i) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onStateChanged(int i) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onVideoAvailableChange(boolean z) {
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onMediaStateUpdated(int i, int i2) {
    }
}
