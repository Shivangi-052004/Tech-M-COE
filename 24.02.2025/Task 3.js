<div id ="root"></div>
<script src="https://unpkg.com/react@18/umd/react.development.js" crossorigin></script>
<script src="https://unpkg.com/react-dom@18/umd/react-dom.development.js" crossorigin></script>
<script src="https://unpkg.com/babel-standalone@6/babel.min.js"></script>
<script type="text/babel">
class Class extends React.Component {
  render() {
    return <h2>The course is {this.props.course}!! </h2>;
  }
}

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Class  course="Information technology"/>);
</script>
