package x4;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import v7.c8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class a {
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};
    public static final int[] h = {R.attr.ordering};
    public static final int[] i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};
    public static final int[] j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};
    public static final int[] k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX WARN: Code restructure failed: missing block: B:10:0x03a9, code lost:
    
        r2 = new android.animation.Animator[r10.size()];
        r3 = r10.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x03b4, code lost:
    
        if (r1 >= r3) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x03b6, code lost:
    
        r4 = r10.get(r1);
        r1 = r1 + 1;
        r2[r11] = (android.animation.Animator) r4;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x03c4, code lost:
    
        if (r33 != 0) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03c6, code lost:
    
        r32.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03c9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03ca, code lost:
    
        r32.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03cd, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x03a5, code lost:
    
        if (r32 == null) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x03a7, code lost:
    
        if (r10 == null) goto L212;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x037d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10) {
        int i11;
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i17;
        String str2;
        Keyframe ofFloat;
        Resources.Theme theme2;
        int i18;
        AttributeSet attributeSet3;
        Resources resources2;
        XmlPullParser xmlPullParser2;
        ValueAnimator valueAnimator;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator2 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i19 = 3;
            int i20 = 0;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i21 = 1;
            if (next == 1) {
                break;
            }
            int i22 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlPullParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = d(context, resources, theme, attributeSet, null, xmlPullParser);
                } else {
                    Resources resources3 = resources;
                    Resources.Theme theme3 = theme;
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray f7 = h0.b.f(resources3, theme3, attributeSet, h);
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null) {
                            theme2 = theme3;
                            i18 = f7.getInt(0, 0);
                            attributeSet3 = attributeSet;
                            xmlPullParser2 = xmlPullParser;
                            resources2 = resources3;
                        } else {
                            theme2 = theme3;
                            i18 = 0;
                            attributeSet3 = attributeSet;
                            resources2 = resources3;
                            xmlPullParser2 = xmlPullParser;
                        }
                        a(context, resources2, theme2, xmlPullParser2, attributeSet3, animatorSet2, i18);
                        valueAnimator2 = animatorSet2;
                        f7.recycle();
                        i11 = depth;
                        if (animatorSet != null && i20 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(valueAnimator2);
                        }
                        depth = i11;
                    } else {
                        String str3 = "propertyValuesHolder";
                        if (!name.equals("propertyValuesHolder")) {
                            throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                        }
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlPullParser.getEventType();
                            if (eventType == i19 || eventType == i21) {
                                break;
                            }
                            if (eventType != i22) {
                                xmlPullParser.next();
                            } else {
                                if (xmlPullParser.getName().equals(str3)) {
                                    TypedArray f10 = h0.b.f(resources3, theme3, asAttributeSet, i);
                                    String b10 = h0.b.b(f10, xmlPullParser, "propertyName", i19);
                                    int i23 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? f10.getInt(i22, 4) : 4;
                                    attributeSet2 = asAttributeSet;
                                    int i24 = i23;
                                    i13 = i22;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlPullParser.next();
                                        i14 = depth;
                                        if (next2 == 3 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlPullParser.getName().equals("keyframe")) {
                                            int[] iArr = j;
                                            str2 = str3;
                                            if (i24 == 4) {
                                                TypedArray f11 = h0.b.f(resources3, theme3, Xml.asAttributeSet(xmlPullParser), iArr);
                                                TypedValue peekValue = !h0.b.c(xmlPullParser, "value") ? null : f11.peekValue(0);
                                                int i25 = (peekValue == null || !c(peekValue.type)) ? 0 : 3;
                                                f11.recycle();
                                                i24 = i25;
                                            }
                                            TypedArray f12 = h0.b.f(resources3, theme3, Xml.asAttributeSet(xmlPullParser), iArr);
                                            float f13 = h0.b.c(xmlPullParser, "fraction") ? f12.getFloat(3, -1.0f) : -1.0f;
                                            TypedValue peekValue2 = !h0.b.c(xmlPullParser, "value") ? null : f12.peekValue(0);
                                            boolean z10 = peekValue2 != null;
                                            int i26 = i24 == 4 ? (z10 && c(peekValue2.type)) ? 3 : 0 : i24;
                                            if (!z10) {
                                                ofFloat = i26 == 0 ? Keyframe.ofFloat(f13) : Keyframe.ofInt(f13);
                                            } else if (i26 == 0) {
                                                ofFloat = Keyframe.ofFloat(f13, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? f12.getFloat(0, 0.0f) : 0.0f);
                                            } else if (i26 == 1 || i26 == 3) {
                                                ofFloat = Keyframe.ofInt(f13, xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? f12.getInt(0, 0) : 0);
                                            } else {
                                                ofFloat = null;
                                            }
                                            int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? f12.getResourceId(1, 0) : 0;
                                            if (resourceId > 0) {
                                                ofFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                            }
                                            f12.recycle();
                                            if (ofFloat != null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(ofFloat);
                                            }
                                            xmlPullParser.next();
                                        } else {
                                            str2 = str3;
                                        }
                                        resources3 = resources;
                                        theme3 = theme;
                                        depth = i14;
                                        str3 = str2;
                                    }
                                    str = str3;
                                    if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                        i16 = 3;
                                        propertyValuesHolder = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                        float fraction = keyframe2.getFraction();
                                        int i27 = size;
                                        Class cls = Integer.TYPE;
                                        Class cls2 = Float.TYPE;
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                arrayList3.add(arrayList3.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                i27++;
                                            }
                                        }
                                        float fraction2 = keyframe.getFraction();
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe.setFraction(0.0f);
                                            } else {
                                                arrayList3.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                i27++;
                                            }
                                        }
                                        int i28 = i27;
                                        Keyframe[] keyframeArr = new Keyframe[i28];
                                        arrayList3.toArray(keyframeArr);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            Keyframe keyframe3 = keyframeArr[i29];
                                            if (keyframe3.getFraction() < 0.0f) {
                                                if (i29 == 0) {
                                                    keyframe3.setFraction(0.0f);
                                                } else {
                                                    int i30 = i28 - 1;
                                                    if (i29 == i30) {
                                                        keyframe3.setFraction(1.0f);
                                                        i17 = i28;
                                                    } else {
                                                        int i31 = i29;
                                                        for (int i32 = i29 + 1; i32 < i30 && keyframeArr[i32].getFraction() < 0.0f; i32++) {
                                                            i31 = i32;
                                                        }
                                                        float fraction3 = (keyframeArr[i31 + 1].getFraction() - keyframeArr[i29 - 1].getFraction()) / ((i31 - i29) + 2);
                                                        int i33 = i29;
                                                        while (i33 <= i31) {
                                                            float f14 = fraction3;
                                                            keyframeArr[i33].setFraction(keyframeArr[i33 - 1].getFraction() + f14);
                                                            i33++;
                                                            i28 = i28;
                                                            fraction3 = f14;
                                                        }
                                                        i17 = i28;
                                                    }
                                                    i29++;
                                                    i28 = i17;
                                                }
                                            }
                                            i17 = i28;
                                            i29++;
                                            i28 = i17;
                                        }
                                        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(b10, keyframeArr);
                                        i16 = 3;
                                        if (i24 == 3) {
                                            propertyValuesHolder.setEvaluator(f.a);
                                        }
                                    }
                                    i15 = 0;
                                    i12 = 1;
                                    if (propertyValuesHolder == null) {
                                        propertyValuesHolder = b(f10, i23, 0, 1, b10);
                                    }
                                    if (propertyValuesHolder != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolder);
                                    }
                                    f10.recycle();
                                } else {
                                    attributeSet2 = asAttributeSet;
                                    i12 = i21;
                                    i13 = i22;
                                    i14 = depth;
                                    i15 = i20;
                                    str = str3;
                                    i16 = i19;
                                }
                                xmlPullParser.next();
                                resources3 = resources;
                                i20 = i15;
                                i21 = i12;
                                i19 = i16;
                                i22 = i13;
                                asAttributeSet = attributeSet2;
                                depth = i14;
                                str3 = str;
                                theme3 = theme;
                            }
                        }
                        int i34 = i21;
                        i11 = depth;
                        int i35 = i20;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i36 = i35; i36 < size2; i36++) {
                                propertyValuesHolderArr[i36] = (PropertyValuesHolder) arrayList2.get(i36);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (valueAnimator2 instanceof ValueAnimator)) {
                            valueAnimator2.setValues(propertyValuesHolderArr);
                        }
                        i20 = i34;
                        if (animatorSet != null) {
                            if (arrayList == null) {
                            }
                            arrayList.add(valueAnimator2);
                        }
                        depth = i11;
                    }
                }
                valueAnimator2 = valueAnimator;
                i11 = depth;
                if (animatorSet != null) {
                }
                depth = i11;
            }
        }
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i11);
        boolean z10 = peekValue != null;
        int i13 = z10 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i12);
        boolean z11 = peekValue2 != null;
        int i14 = z11 ? peekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z10 && c(i13)) || (z11 && c(i14))) ? 3 : 0;
        }
        boolean z12 = i10 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            i0.d[] c10 = c8.c(string);
            i0.d[] c11 = c8.c(string2);
            if (c10 != null || c11 != null) {
                if (c10 != null) {
                    e eVar = new e();
                    if (c11 == null) {
                        return PropertyValuesHolder.ofObject(str, eVar, c10);
                    }
                    if (c8.a(c10, c11)) {
                        return PropertyValuesHolder.ofObject(str, eVar, c10, c11);
                    }
                    throw new InflateException(e2.j(" Can't morph from ", string, " to ", string2));
                }
                if (c11 != null) {
                    return PropertyValuesHolder.ofObject(str, new e(), c11);
                }
            }
            return null;
        }
        f fVar = i10 == 3 ? f.a : null;
        if (z12) {
            if (z10) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z11) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z10) {
            int dimension2 = i13 == 5 ? (int) typedArray.getDimension(i11, 0.0f) : c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            if (z11) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z11) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i14 == 5 ? (int) typedArray.getDimension(i12, 0.0f) : c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0));
        }
        if (propertyValuesHolder != null && fVar != null) {
            propertyValuesHolder.setEvaluator(fVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator;
        int i10;
        ValueAnimator valueAnimator2;
        TypedArray f7 = h0.b.f(resources, theme, attributeSet, g);
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        long j3 = h0.b.c(xmlPullParser, "duration") ? f7.getInt(1, 300) : 300;
        long j10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? f7.getInt(2, 0) : 0;
        int i11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? f7.getInt(7, 4) : 4;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i11 == 4) {
                TypedValue peekValue = f7.peekValue(5);
                boolean z10 = peekValue != null;
                int i12 = z10 ? peekValue.type : 0;
                TypedValue peekValue2 = f7.peekValue(6);
                boolean z11 = peekValue2 != null;
                i11 = ((z10 && c(i12)) || (z11 && c(z11 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder b10 = b(f7, i11, 5, 6, "");
            if (b10 != null) {
                valueAnimator3.setValues(b10);
            }
        }
        valueAnimator3.setDuration(j3);
        valueAnimator3.setStartDelay(j10);
        valueAnimator3.setRepeatCount(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? f7.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? f7.getInt(4, 1) : 1);
        if (f10 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String b11 = h0.b.b(f10, xmlPullParser, "pathData", 1);
            if (b11 != null) {
                String b12 = h0.b.b(f10, xmlPullParser, "propertyXName", 2);
                String b13 = h0.b.b(f10, xmlPullParser, "propertyYName", 3);
                if (i11 != 2) {
                }
                if (b12 == null && b13 == null) {
                    throw new InflateException(f10.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d10 = c8.d(b11);
                PathMeasure pathMeasure = new PathMeasure(d10, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f11 = 0.0f;
                do {
                    f11 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f11));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d10, false);
                int min = Math.min(100, ((int) (f11 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f12 = f11 / (min - 1);
                int i13 = 0;
                valueAnimator = valueAnimator3;
                float f13 = 0.0f;
                int i14 = 0;
                while (true) {
                    if (i13 >= min) {
                        break;
                    }
                    int i15 = min;
                    pathMeasure2.getPosTan(f13 - ((Float) arrayList.get(i14)).floatValue(), fArr3, null);
                    fArr[i13] = fArr3[0];
                    fArr2[i13] = fArr3[1];
                    int i16 = i14 + 1;
                    f13 += f12;
                    if (i16 < arrayList.size() && f13 > ((Float) arrayList.get(i16)).floatValue()) {
                        pathMeasure2.nextContour();
                        i14 = i16;
                    }
                    i13++;
                    min = i15;
                }
                PropertyValuesHolder ofFloat = b12 != null ? PropertyValuesHolder.ofFloat(b12, fArr) : null;
                PropertyValuesHolder ofFloat2 = b13 != null ? PropertyValuesHolder.ofFloat(b13, fArr2) : null;
                if (ofFloat == null) {
                    objectAnimator2.setValues(ofFloat2);
                } else if (ofFloat2 == null) {
                    objectAnimator2.setValues(ofFloat);
                } else {
                    objectAnimator2.setValues(ofFloat, ofFloat2);
                }
                i10 = 0;
            } else {
                valueAnimator = valueAnimator3;
                i10 = 0;
                objectAnimator2.setPropertyName(h0.b.b(f10, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            i10 = 0;
        }
        int resourceId = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? f7.getResourceId(i10, i10) : i10;
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        f7.recycle();
        if (f10 != null) {
            f10.recycle();
        }
        return valueAnimator2;
    }
}
