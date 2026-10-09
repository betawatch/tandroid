package x4;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.ui.Components.hr;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v7.q8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d extends hr implements Animatable {
    public final Context d;
    public final i.f e = new i.f(this, 8);
    public final b c = new b();

    public d(Context context) {
        this.d = context;
    }

    @Override // org.telegram.ui.Components.hr, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.c;
        bVar.a.draw(canvas);
        if (bVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getAlpha() : this.c.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.c.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getColorFilter() : this.c.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.b) == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(((Drawable) this.b).getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.c.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.c.a.getIntrinsicWidth();
    }

    @Override // org.telegram.ui.Components.hr, android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.getOpacity() : this.c.a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0188, code lost:
    
        if (r8.b != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x018a, code lost:
    
        r8.b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0191, code lost:
    
        r8.b.playTogether(r8.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0198, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        XmlResourceParser animation;
        Animator a2;
        o oVar;
        int next;
        o oVar2;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            b bVar = this.c;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f7 = h0.b.f(resources, theme, attributeSet, a.e);
                    int resourceId = f7.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = o.v;
                        if (Build.VERSION.SDK_INT >= 24) {
                            oVar = new o();
                            ThreadLocal threadLocal = h0.j.a;
                            oVar.b = resources.getDrawable(resourceId, theme);
                            new n(((Drawable) oVar.b).getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                oVar = new o();
                                oVar.inflate(resources, xml, asAttributeSet, theme);
                            } catch (IOException e7) {
                                Log.e("VectorDrawableCompat", "parser error", e7);
                                oVar = null;
                                oVar.h = false;
                                oVar.setCallback(this.e);
                                oVar2 = bVar.a;
                                if (oVar2 != null) {
                                }
                                bVar.a = oVar;
                                f7.recycle();
                                eventType = xmlPullParser.next();
                            } catch (XmlPullParserException e10) {
                                Log.e("VectorDrawableCompat", "parser error", e10);
                                oVar = null;
                                oVar.h = false;
                                oVar.setCallback(this.e);
                                oVar2 = bVar.a;
                                if (oVar2 != null) {
                                }
                                bVar.a = oVar;
                                f7.recycle();
                                eventType = xmlPullParser.next();
                            }
                        }
                        oVar.h = false;
                        oVar.setCallback(this.e);
                        oVar2 = bVar.a;
                        if (oVar2 != null) {
                            oVar2.setCallback(null);
                        }
                        bVar.a = oVar;
                    }
                    f7.recycle();
                } else {
                    XmlResourceParser xmlResourceParser = null;
                    if ("target".equals(name)) {
                        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f);
                        String string = obtainAttributes.getString(0);
                        int resourceId2 = obtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.d;
                            if (context == null) {
                                obtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                a2 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        animation = resources2.getAnimation(resourceId2);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                } catch (XmlPullParserException e12) {
                                    e = e12;
                                }
                                try {
                                    a2 = a.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                    animation.close();
                                } catch (IOException e13) {
                                    e = e13;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e14) {
                                    e = e14;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    xmlResourceParser = animation;
                                    if (xmlResourceParser != null) {
                                        xmlResourceParser.close();
                                    }
                                    throw th;
                                }
                            }
                            a2.setTarget(bVar.a.c.b.o.get(string));
                            if (bVar.c == null) {
                                bVar.c = new ArrayList();
                                bVar.d = new a0.f(0);
                            }
                            bVar.c.add(a2);
                            bVar.d.put(a2, string);
                        }
                        obtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.isAutoMirrored() : this.c.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.c.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.isStateful() : this.c.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.c.a.setBounds(rect);
        }
    }

    @Override // org.telegram.ui.Components.hr, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.setLevel(i10) : this.c.a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = (Drawable) this.b;
        return drawable != null ? drawable.setState(iArr) : this.c.a.setState(iArr);
    }

    @Override // org.telegram.ui.Components.hr, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.c.a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.c.a.setAutoMirrored(z10);
        }
    }

    @Override // org.telegram.ui.Components.hr, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.c.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            q8.a(i10, drawable);
        } else {
            this.c.a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.c.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.c.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.c.a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.c;
        if (bVar.b.isStarted()) {
            return;
        }
        bVar.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.c.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
