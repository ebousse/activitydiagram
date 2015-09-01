/**
 */
package activitydiagramTrace.Steps;

import activitydiagramTrace.Traced.activitydiagram.TracedActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activitydiagram Activity Reset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Reset#getThis <em>This</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Activity_Reset()
 * @model
 * @generated
 */
public interface Activitydiagram_Activity_Reset extends Activitydiagram_Activity_WriteTrace_AbstractSubEvent, SmallStep {
	/**
	 * Returns the value of the '<em><b>This</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>This</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>This</em>' reference.
	 * @see #setThis(TracedActivity)
	 * @see activitydiagramTrace.Steps.StepsPackage#getActivitydiagram_Activity_Reset_This()
	 * @model
	 * @generated
	 */
	TracedActivity getThis();

	/**
	 * Sets the value of the '{@link activitydiagramTrace.Steps.Activitydiagram_Activity_Reset#getThis <em>This</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>This</em>' reference.
	 * @see #getThis()
	 * @generated
	 */
	void setThis(TracedActivity value);

} // Activitydiagram_Activity_Reset