// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class xld {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0381, code lost:
    
        r2 = new android.animation.Animator[r10.size()];
        r3 = r10.size();
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x038c, code lost:
    
        if (r1 >= r3) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x038e, code lost:
    
        r4 = r10.get(r1);
        r1 = r1 + 1;
        r2[r11] = (android.animation.Animator) r4;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x039c, code lost:
    
        if (r34 != 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x039e, code lost:
    
        r33.playTogether(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03a1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x03a2, code lost:
    
        r33.playSequentially(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03a5, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x037c, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x037d, code lost:
    
        if (r33 == null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x037f, code lost:
    
        if (r10 == null) goto L205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0360 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i) {
        int i2;
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        int i7;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        String str2;
        Keyframe ofFloat;
        Resources.Theme theme2;
        int i8;
        AttributeSet attributeSet3;
        Resources resources2;
        XmlResourceParser xmlResourceParser2;
        ValueAnimator valueAnimator;
        int depth = xmlResourceParser.getDepth();
        ValueAnimator valueAnimator2 = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i9 = 3;
            int i10 = 0;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i11 = 1;
            if (next == 1) {
                break;
            }
            int i12 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = d(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else {
                    Resources resources3 = resources;
                    Resources.Theme theme3 = theme;
                    if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray d = bwe.d(resources3, theme3, attributeSet, pd0.i);
                        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "ordering") != null) {
                            theme2 = theme3;
                            i8 = d.getInt(0, 0);
                            attributeSet3 = attributeSet;
                            xmlResourceParser2 = xmlResourceParser;
                            resources2 = resources3;
                        } else {
                            theme2 = theme3;
                            i8 = 0;
                            attributeSet3 = attributeSet;
                            resources2 = resources3;
                            xmlResourceParser2 = xmlResourceParser;
                        }
                        a(context, resources2, theme2, xmlResourceParser2, attributeSet3, animatorSet2, i8);
                        valueAnimator2 = animatorSet2;
                        d.recycle();
                        i2 = depth;
                        if (animatorSet != null && i10 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(valueAnimator2);
                        }
                        depth = i2;
                    } else {
                        String str3 = "propertyValuesHolder";
                        if (!name.equals("propertyValuesHolder")) {
                            k93.c(xmlResourceParser.getName(), "Unknown animator name: ");
                            return null;
                        }
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                        ArrayList arrayList2 = null;
                        while (true) {
                            int eventType = xmlResourceParser.getEventType();
                            if (eventType == i9 || eventType == i11) {
                                break;
                            }
                            if (eventType != i12) {
                                xmlResourceParser.next();
                            } else {
                                if (xmlResourceParser.getName().equals(str3)) {
                                    TypedArray d2 = bwe.d(resources3, theme3, asAttributeSet, pd0.j);
                                    String b = bwe.b(d2, xmlResourceParser, "propertyName", i9);
                                    int i13 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? d2.getInt(i12, 4) : 4;
                                    attributeSet2 = asAttributeSet;
                                    int i14 = i13;
                                    i4 = i12;
                                    ArrayList arrayList3 = null;
                                    while (true) {
                                        int next2 = xmlResourceParser.next();
                                        i5 = depth;
                                        if (next2 == 3 || next2 == 1) {
                                            break;
                                        }
                                        if (xmlResourceParser.getName().equals("keyframe")) {
                                            int[] iArr = pd0.k;
                                            str2 = str3;
                                            if (i14 == 4) {
                                                TypedArray d3 = bwe.d(resources3, theme3, Xml.asAttributeSet(xmlResourceParser), iArr);
                                                TypedValue peekValue = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? d3.peekValue(0) : null;
                                                int i15 = (peekValue == null || !c(peekValue.type)) ? 0 : 3;
                                                d3.recycle();
                                                i14 = i15;
                                            }
                                            TypedArray d4 = bwe.d(resources3, theme3, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            float f = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fraction") != null ? d4.getFloat(3, -1.0f) : -1.0f;
                                            TypedValue peekValue2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? d4.peekValue(0) : null;
                                            boolean z = peekValue2 != null;
                                            int i16 = i14 == 4 ? (z && c(peekValue2.type)) ? 3 : 0 : i14;
                                            if (!z) {
                                                ofFloat = i16 == 0 ? Keyframe.ofFloat(f) : Keyframe.ofInt(f);
                                            } else if (i16 == 0) {
                                                ofFloat = Keyframe.ofFloat(f, xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? d4.getFloat(0, 0.0f) : 0.0f);
                                            } else if (i16 == 1 || i16 == 3) {
                                                ofFloat = Keyframe.ofInt(f, xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "value") != null ? d4.getInt(0, 0) : 0);
                                            } else {
                                                ofFloat = null;
                                            }
                                            int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? d4.getResourceId(1, 0) : 0;
                                            if (resourceId > 0) {
                                                ofFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                            }
                                            d4.recycle();
                                            if (ofFloat != null) {
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                arrayList3.add(ofFloat);
                                            }
                                            xmlResourceParser.next();
                                        } else {
                                            str2 = str3;
                                        }
                                        resources3 = resources;
                                        theme3 = theme;
                                        depth = i5;
                                        str3 = str2;
                                    }
                                    str = str3;
                                    if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                        i7 = 3;
                                        propertyValuesHolder = null;
                                    } else {
                                        Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                        Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                        float fraction = keyframe2.getFraction();
                                        int i17 = size;
                                        Class cls = Integer.TYPE;
                                        Class cls2 = Float.TYPE;
                                        if (fraction < 1.0f) {
                                            if (fraction < 0.0f) {
                                                keyframe2.setFraction(1.0f);
                                            } else {
                                                arrayList3.add(arrayList3.size(), keyframe2.getType() == cls2 ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == cls ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                                i17++;
                                            }
                                        }
                                        float fraction2 = keyframe.getFraction();
                                        if (fraction2 != 0.0f) {
                                            if (fraction2 < 0.0f) {
                                                keyframe.setFraction(0.0f);
                                            } else {
                                                arrayList3.add(0, keyframe.getType() == cls2 ? Keyframe.ofFloat(0.0f) : keyframe.getType() == cls ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                                i17++;
                                            }
                                        }
                                        int i18 = i17;
                                        Keyframe[] keyframeArr = new Keyframe[i18];
                                        arrayList3.toArray(keyframeArr);
                                        int i19 = 0;
                                        while (i19 < i18) {
                                            Keyframe keyframe3 = keyframeArr[i19];
                                            if (keyframe3.getFraction() < 0.0f) {
                                                if (i19 == 0) {
                                                    keyframe3.setFraction(0.0f);
                                                } else {
                                                    int i20 = i18 - 1;
                                                    if (i19 == i20) {
                                                        keyframe3.setFraction(1.0f);
                                                    } else {
                                                        int i21 = i19;
                                                        for (int i22 = i19 + 1; i22 < i20 && keyframeArr[i22].getFraction() < 0.0f; i22++) {
                                                            i21 = i22;
                                                        }
                                                        float fraction3 = (keyframeArr[i21 + 1].getFraction() - keyframeArr[i19 - 1].getFraction()) / ((i21 - i19) + 2);
                                                        int i23 = i19;
                                                        while (i23 <= i21) {
                                                            float f2 = fraction3;
                                                            keyframeArr[i23].setFraction(keyframeArr[i23 - 1].getFraction() + f2);
                                                            i23++;
                                                            i18 = i18;
                                                            fraction3 = f2;
                                                        }
                                                    }
                                                }
                                            }
                                            i19++;
                                            i18 = i18;
                                        }
                                        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(b, keyframeArr);
                                        i7 = 3;
                                        if (i14 == 3) {
                                            propertyValuesHolder.setEvaluator(is.a);
                                        }
                                    }
                                    i6 = 0;
                                    i3 = 1;
                                    if (propertyValuesHolder == null) {
                                        propertyValuesHolder = b(d2, i13, 0, 1, b);
                                    }
                                    if (propertyValuesHolder != null) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(propertyValuesHolder);
                                    }
                                    d2.recycle();
                                } else {
                                    attributeSet2 = asAttributeSet;
                                    i3 = i11;
                                    i4 = i12;
                                    i5 = depth;
                                    i6 = i10;
                                    str = str3;
                                    i7 = i9;
                                }
                                xmlResourceParser.next();
                                resources3 = resources;
                                i10 = i6;
                                i11 = i3;
                                i9 = i7;
                                i12 = i4;
                                asAttributeSet = attributeSet2;
                                depth = i5;
                                str3 = str;
                                theme3 = theme;
                            }
                        }
                        int i24 = i11;
                        i2 = depth;
                        int i25 = i10;
                        if (arrayList2 != null) {
                            int size2 = arrayList2.size();
                            propertyValuesHolderArr = new PropertyValuesHolder[size2];
                            for (int i26 = i25; i26 < size2; i26++) {
                                propertyValuesHolderArr[i26] = (PropertyValuesHolder) arrayList2.get(i26);
                            }
                        } else {
                            propertyValuesHolderArr = null;
                        }
                        if (propertyValuesHolderArr != null && (valueAnimator2 instanceof ValueAnimator)) {
                            valueAnimator2.setValues(propertyValuesHolderArr);
                        }
                        i10 = i24;
                        if (animatorSet != null) {
                            if (arrayList == null) {
                            }
                            arrayList.add(valueAnimator2);
                        }
                        depth = i2;
                    }
                }
                valueAnimator2 = valueAnimator;
                i2 = depth;
                if (animatorSet != null) {
                }
                depth = i2;
            }
        }
    }

    public static PropertyValuesHolder b(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && c(i4)) || (z2 && c(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            ky7[] c = mqe.c(string);
            ky7[] c2 = mqe.c(string2);
            if (c == null) {
                if (c2 != null) {
                    return PropertyValuesHolder.ofObject(str, new sn(), c2);
                }
                return null;
            }
            sn snVar = new sn();
            if (c2 == null) {
                return PropertyValuesHolder.ofObject(str, snVar, c);
            }
            if (mqe.a(c, c2)) {
                return PropertyValuesHolder.ofObject(str, snVar, c, c2);
            }
            throw new InflateException(tb4.q(" Can't morph from ", string, " to ", string2));
        }
        is isVar = i == 3 ? is.a : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : c(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : c(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z2) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : c(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
        }
        if (propertyValuesHolder != null && isVar != null) {
            propertyValuesHolder.setEvaluator(isVar);
        }
        return propertyValuesHolder;
    }

    public static boolean c(int i) {
        return i >= 28 && i <= 31;
    }

    public static ValueAnimator d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        int i;
        ValueAnimator valueAnimator2;
        TypedArray d = bwe.d(resources, theme, attributeSet, pd0.h);
        TypedArray d2 = bwe.d(resources, theme, attributeSet, pd0.l);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        boolean c = bwe.c(xmlResourceParser, "duration");
        int i2 = kk7.W4;
        if (c) {
            i2 = d.getInt(1, kk7.W4);
        }
        long j = i2;
        long j2 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startOffset") != null ? d.getInt(2, 0) : 0;
        int i3 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueType") != null ? d.getInt(7, 4) : 4;
        if (xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null && xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
            if (i3 == 4) {
                TypedValue peekValue = d.peekValue(5);
                boolean z = peekValue != null;
                int i4 = z ? peekValue.type : 0;
                TypedValue peekValue2 = d.peekValue(6);
                boolean z2 = peekValue2 != null;
                i3 = ((z && c(i4)) || (z2 && c(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder b = b(d, i3, 5, 6, "");
            if (b != null) {
                valueAnimator3.setValues(b);
            }
        }
        valueAnimator3.setDuration(j);
        valueAnimator3.setStartDelay(j2);
        valueAnimator3.setRepeatCount(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatCount") != null ? d.getInt(3, 0) : 0);
        valueAnimator3.setRepeatMode(xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "repeatMode") != null ? d.getInt(4, 1) : 1);
        if (d2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String b2 = bwe.b(d2, xmlResourceParser, "pathData", 1);
            if (b2 != null) {
                String b3 = bwe.b(d2, xmlResourceParser, "propertyXName", 2);
                String b4 = bwe.b(d2, xmlResourceParser, "propertyYName", 3);
                if (b3 == null && b4 == null) {
                    throw new InflateException(d2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d3 = mqe.d(b2);
                PathMeasure pathMeasure = new PathMeasure(d3, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f = 0.0f;
                do {
                    f += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d3, false);
                int min = Math.min(100, ((int) (f / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f2 = f / (min - 1);
                int i5 = 0;
                valueAnimator = valueAnimator3;
                float f3 = 0.0f;
                int i6 = 0;
                while (true) {
                    if (i5 >= min) {
                        break;
                    }
                    int i7 = min;
                    pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i6)).floatValue(), fArr3, null);
                    fArr[i5] = fArr3[0];
                    fArr2[i5] = fArr3[1];
                    int i8 = i6 + 1;
                    f3 += f2;
                    if (i8 < arrayList.size() && f3 > ((Float) arrayList.get(i8)).floatValue()) {
                        pathMeasure2.nextContour();
                        i6 = i8;
                    }
                    i5++;
                    min = i7;
                }
                PropertyValuesHolder ofFloat = b3 != null ? PropertyValuesHolder.ofFloat(b3, fArr) : null;
                PropertyValuesHolder ofFloat2 = b4 != null ? PropertyValuesHolder.ofFloat(b4, fArr2) : null;
                if (ofFloat == null) {
                    objectAnimator2.setValues(ofFloat2);
                } else if (ofFloat2 == null) {
                    objectAnimator2.setValues(ofFloat);
                } else {
                    objectAnimator2.setValues(ofFloat, ofFloat2);
                }
                i = 0;
            } else {
                valueAnimator = valueAnimator3;
                i = 0;
                objectAnimator2.setPropertyName(bwe.b(d2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            i = 0;
        }
        int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? d.getResourceId(i, i) : i;
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        d.recycle();
        if (d2 != null) {
            d2.recycle();
        }
        return valueAnimator2;
    }
}
